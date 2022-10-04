package co.knryco.cuboid.challenge.service.impl

import co.knryco.cuboid.challenge.dto.BagDTO
import co.knryco.cuboid.challenge.dto.NewBagDTO
import co.knryco.cuboid.challenge.exception.ResourceNotFoundException
import co.knryco.cuboid.challenge.model.Bag
import co.knryco.cuboid.challenge.repository.BagRepository
import co.knryco.cuboid.challenge.service.BagService
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
class BagServiceImpl @Autowired constructor(private val repository: BagRepository, private val mapper: ModelMapper) :
    BagService {
    /**
     * Create and persist a new bag
     * @param newBagDTO - DTO representing a new Bag
     * @return BagDTO
     */
    @Transactional
    override fun create(newBagDTO: NewBagDTO?): BagDTO {
        var bag = Bag(newBagDTO.getTitle, newBagDTO.getVolume())
        bag = repository.save(bag)
        return mapper.map(bag, BagDTO::class.java)
    }

    /**
     * List all existing bags
     * @return List<BagDTO>
    </BagDTO> */
    @get:Transactional(readOnly = true)
    override val all: List<BagDTO>
        get() {
            val bags = repository.findAll()
            return bags.stream().map { bag: Bag? -> mapper.map(bag, BagDTO::class.java) }
                .collect(Collectors.toList())
        }

    /**
     * Find a bag by its ID
     * @param id - Bag ID
     * @return BagDTO
     */
    @Transactional(readOnly = true)
    override fun findById(id: Long): BagDTO {
        val bag = repository.findById(id).orElseThrow { ResourceNotFoundException("Bag not found") }!!
        return mapper.map(bag, BagDTO::class.java)
    }
}