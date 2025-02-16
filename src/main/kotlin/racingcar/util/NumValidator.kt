package racingcar.util

object NumValidator {
    fun isNumBlank(num: String) {
        if (num.isEmpty()) {

            Error.NOT_INPUT_NUM.throwErrorMessage()
        }
    }

    fun isNumDigit(n: Char) {
        if (!n.isDigit()) {
            Error.INPUT_NOT_INT.throwErrorMessage()
        }
    }

    fun checkNumDigit(num: String) {
        num.all { it.isDigit() }
    }

    fun isNumPositive(num: String) {
        if (num.toInt() <= 0) {
            Error.INPUT_NOT_POSITIVE.throwErrorMessage()
        }
    }

    fun isNumInt(num: String) {
        if (num.toDouble() % 1 != 0.0) {
            Error.INPUT_NOT_INT.throwErrorMessage()
        }
    }
}
