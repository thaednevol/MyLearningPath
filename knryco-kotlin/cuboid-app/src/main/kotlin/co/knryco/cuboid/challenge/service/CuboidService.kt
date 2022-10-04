package co.knryco.cuboid.challenge.service

import co.knryco.cuboid.challenge.dto.CuboidDTO

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
interface CuboidService {
    fun create(cuboid: CuboidDTO?): CuboidDTO
    val all: List<CuboidDTO>
    fun update(cuboid: CuboidDTO?, id: Long): CuboidDTO
    fun delete(id: Long): CuboidDTO
}