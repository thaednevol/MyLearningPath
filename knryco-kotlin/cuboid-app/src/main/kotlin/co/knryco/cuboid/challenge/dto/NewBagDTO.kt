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
class NewBagDTO {
    private val volume: @NotNull(message = "Bag volume can't be null.") Double? = null
    private val title: @NotNull(message = "Bag title can't be null.") @Size(
        max = Bag.Companion.TITLE_MAX_SIZE,
        message = "Bag title maximum size is " + Bag.Companion.TITLE_MAX_SIZE + " characters."
    ) String? = null
}