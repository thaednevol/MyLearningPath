package co.knryco.cuboid.challenge.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
class UnprocessableEntityException(message: String?) : RuntimeException(message)