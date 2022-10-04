package co.knryco.cuboid.challenge.service

import co.knryco.cuboid.challenge.dto.BagDTO
import co.knryco.cuboid.challenge.dto.NewBagDTO

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
interface BagService {
    fun create(newBagDTO: NewBagDTO?): BagDTO
    val all: List<BagDTO>
    fun findById(id: Long): BagDTO
}