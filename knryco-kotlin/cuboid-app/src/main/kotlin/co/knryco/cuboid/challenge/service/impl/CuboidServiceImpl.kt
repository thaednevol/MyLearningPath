package co.knryco.cuboid.challenge.service.impl

import co.knryco.cuboid.challenge.dto.CuboidDTO
import co.knryco.cuboid.challenge.exception.ResourceNotFoundException
import co.knryco.cuboid.challenge.exception.UnprocessableEntityException
import co.knryco.cuboid.challenge.model.Bag
import co.knryco.cuboid.challenge.model.Cuboid
import co.knryco.cuboid.challenge.repository.BagRepository
import co.knryco.cuboid.challenge.repository.CuboidRepository
import co.knryco.cuboid.challenge.service.CuboidService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.stream.Collectors

/**
 * Implementation class for BagService
 *
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@Service
class CuboidServiceImpl @Autowired constructor(
    @param:Autowired private val repository: CuboidRepository,
    private val bagRepository: BagRepository, private val mapper: ModelMapper
) : CuboidService {
    /**
     * Create a new cuboid and add it to its bag checking the bag available capacity.
     *
     * @param cuboidDTO DTO with cuboid properties to be persisted
     * @return CuboidDTO with the data created
     */
    @Transactional
    override fun create(cuboidDTO: CuboidDTO?): CuboidDTO {
        val bag = getBagById(cuboidDTO.getBagId())
        var cuboid = mapper.map(cuboidDTO, Cuboid::class.java)
        if (bag.availableVolume < cuboid.volume) {
            throw UnprocessableEntityException("There's not space in the bag.")
        }
        cuboid.bag = bag
        cuboid = repository.save(cuboid)
        return mapper.map(cuboid, CuboidDTO::class.java)
    }

    /**
     * List all cuboids
     * @return List<CuboidDTO>
    </CuboidDTO> */
    @get:Transactional(readOnly = true)
    override val all: List<CuboidDTO>
        get() {
            val cuboids = repository.findAll()
            return cuboids.stream().map { bag: Cuboid? -> mapper.map(bag, CuboidDTO::class.java) }
                .collect(Collectors.toList())
        }

    override fun update(cuboidDTO: CuboidDTO?, id: Long): CuboidDTO {
        val cuboid = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("Cuboid not found") }!!
        val bag = bagRepository.findById(cuboidDTO.getBagId())
            .orElseThrow { ResourceNotFoundException("Bag not found") }!!
        if (bag.volume < calculateVolume(cuboidDTO)) {
            throw UnprocessableEntityException("Cuboid volume is greater than bag volume")
        }
        cuboid.bag = bag
        cuboid.height = cuboidDTO.getHeight()
        cuboid.width = cuboidDTO.getWidth()
        cuboid.depth = cuboidDTO.getDepth()
        repository.save(cuboid)
        return mapper.map(cuboid, CuboidDTO::class.java)
    }

    private fun calculateVolume(cuboidDTO: CuboidDTO?): Double {
        return if (cuboidDTO.getVolume() != null) cuboidDTO.getVolume() else cuboidDTO.getWidth() * cuboidDTO.getHeight() * cuboidDTO.getDepth()
    }

    override fun delete(id: Long): CuboidDTO {
        val cuboid = repository.findById(id)
            .orElseThrow { ResourceNotFoundException("Cuboid not found") }!!
        cuboid.bag = null
        repository.delete(cuboid)
        return mapper.map(cuboid, CuboidDTO::class.java)
    }

    private fun getBagById(bagId: Long): Bag {
        return bagRepository.findById(bagId).orElseThrow { ResourceNotFoundException("Bag not found") }!!
    }
}