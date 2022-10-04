package co.knryco.cuboid.challenge.controller

import co.knryco.cuboid.challenge.dto.BagDTO
import co.knryco.cuboid.challenge.dto.NewBagDTO
import co.knryco.cuboid.challenge.service.BagService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@RestController
@RequestMapping("/bags")
class BagController @Autowired constructor(private val service: BagService) {
    @PostMapping
    fun create(@RequestBody resource: @Valid NewBagDTO?): ResponseEntity<BagDTO?> {
        val bag = service.create(resource)
        return ResponseEntity(bag, HttpStatus.CREATED)
    }

    @get:GetMapping
    val all: List<BagDTO?>?
        get() = service.all

    @GetMapping("{id}")
    fun getById(@PathVariable("id") bagId: Long): ResponseEntity<BagDTO?> {
        val bagDTO = service.findById(bagId)
        return ResponseEntity(bagDTO, HttpStatus.OK)
    }
}