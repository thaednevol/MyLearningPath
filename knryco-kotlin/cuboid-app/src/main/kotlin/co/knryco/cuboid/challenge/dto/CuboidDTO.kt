package co.knryco.cuboid.challenge.dto

import lombok.*
import javax.validation.constraints.NotNull

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
class CuboidDTO {
    private val id: Long? = null
    private val width: @NotNull(message = "Cuboid width can't be null.") Float? = null
    private val height: @NotNull(message = "Cuboid height can't be null.") Float? = null
    private val depth: @NotNull(message = "Cuboid depth can't be null.") Float? = null
    private val volume: Double? = null
    private val bagId: @NotNull(message = "Cuboid related bag can't be null.") Long? = null
}