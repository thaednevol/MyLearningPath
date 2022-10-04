package co.knryco.cuboid.challenge.controller

import co.knryco.cuboid.challenge.dto.CuboidDTO
import co.knryco.cuboid.challenge.service.CuboidService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@RestController
@RequestMapping("/cuboids")
@Validated
class CuboidController @Autowired constructor(private val service: CuboidService) {
    @PostMapping
    fun create(@RequestBody cuboidDTO: @Valid CuboidDTO?): ResponseEntity<CuboidDTO?> {
        val cuboid = service.create(cuboidDTO)
        return ResponseEntity(cuboid, HttpStatus.CREATED)
    }

    @PutMapping("{id}")
    fun update(
        @RequestBody cuboidDTO: @Valid CuboidDTO?,
        @PathVariable(name = "id") id: Long
    ): ResponseEntity<CuboidDTO?> {
        val cuboid = service.update(cuboidDTO, id)
        return ResponseEntity(cuboid, HttpStatus.OK)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable(name = "id") id: Long): ResponseEntity<CuboidDTO?> {
        val cuboid = service.delete(id)
        return ResponseEntity(cuboid, HttpStatus.OK)
    }

    @get:GetMapping
    val all: List<CuboidDTO?>?
        get() = service.all
}