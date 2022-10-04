package co.knryco.cuboid.challenge.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(value = [ResourceNotFoundException::class])
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    fun resourceNotFoundException(ex: ResourceNotFoundException, request: WebRequest): ErrorDetails {
        return ErrorDetails(ex.message, request.getDescription(false))
    }

    @ExceptionHandler(value = [UnprocessableEntityException::class])
    @ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
    fun unprocessedEntityException(ex: UnprocessableEntityException, request: WebRequest): ErrorDetails {
        return ErrorDetails(ex.message, request.getDescription(false))
    }

    @ExceptionHandler(value = [ConstraintViolationException::class])
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun constraintViolationException(ex: ConstraintViolationException): ValidationError {
        val errors = ValidationError()
        for (violation in ex.constraintViolations) {
            errors.addViolations(ErrorDetails(violation.message, violation.propertyPath.toString()))
        }
        return errors
    }

    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun constraintViolationException(ex: MethodArgumentNotValidException): ValidationError {
        val errors = ValidationError()
        for (violation in ex.bindingResult.fieldErrors) {
            errors.addViolations(ErrorDetails(violation.defaultMessage, violation.field))
        }
        return errors
    }
}