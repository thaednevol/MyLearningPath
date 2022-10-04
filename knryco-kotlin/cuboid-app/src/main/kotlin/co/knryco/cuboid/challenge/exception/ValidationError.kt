package co.knryco.cuboid.challenge.exception

class ValidationError {
    private val violations: MutableList<ErrorDetails> = ArrayList()
    fun getViolations(): List<ErrorDetails> {
        return violations
    }

    fun addViolations(violation: ErrorDetails) {
        violations.add(violation)
    }
}