package racingcar.util



object Validator {
    fun isBlank(name: String) {
        if (name.isBlank()) {
            Error.NOT_INPUT_CAR.throwErrorMessage()
        }
    }

    fun isNumBlack(num: String) {
        if (num.isBlank()) {

            Error.NOT_INPUT_NUM.throwErrorMessage()        }
    }

    fun isNumDigit(n: Char) {
        if (!n.isDigit()) {
            Error.INPUT_NOT_INT.throwErrorMessage()
        }
    }

    fun checkNumDigit(num: String) {
        for (n in num) {
            isNumDigit(n)
        }
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

    fun countName(name: String) {
        if (name.length > 5) {
            Error.OVER_INPUT_CAR.throwErrorMessage()
        }
    }

    fun checkBlank(carList: List<String>) {
        for (car in carList) {
            isBlank((car))
        }
    }

    fun checkNameLength(carList: List<String>) {
        for (car in carList) {
            countName(car)
        }
    }
}
