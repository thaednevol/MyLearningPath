package co.knryco.cuboid.challenge.dto

import co.knryco.cuboid.challenge.model.Bag
import lombok.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
class BagDTO {
    private val id: Long? = null
    private val volume: @NotNull(message = "Bag volume can't be null.") Double? = null
    private val title: @NotNull(message = "Bag title can't be null.") @Size(
        min = 1,
        max = Bag.Companion.TITLE_MAX_SIZE,
        message = "Bag title maximum size is " + Bag.Companion.TITLE_MAX_SIZE + " characters."
    ) String? = null
    private val payloadVolume: Double? = null
    private val availableVolume: Double? = null
    private val cuboids: List<CuboidDTO>? = null
}