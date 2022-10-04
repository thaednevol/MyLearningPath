package co.knryco.cuboid.challenge.exception

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter

@Getter
@Setter
@AllArgsConstructor
class ErrorDetails(message: String?, description: String) {
    private val message: String? = null
    private val details: String? = null
}