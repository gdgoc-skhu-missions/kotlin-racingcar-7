package racingcar.util

object CarValidator {
    fun isBlank(name: String) {
        if (name.isEmpty()) {
            Error.NOT_INPUT_CAR.throwErrorMessage()
        }
    }

    private fun countName(name: String) {
        if (name.length > 5) {
            Error.OVER_INPUT_CAR.throwErrorMessage()
        }
    }

    fun checkBlank(carList: List<String>) {
        carList.forEach { car -> isBlank(car) }

    }

    fun checkNameLength(carList: List<String>) {
        for (car in carList) {
            countName(car)
        }
    }
    fun checkName(carList: List<String>) {
        val carSet = carList.toSet()
        if (carSet.size < carList.size) {
            Error.DUPLICATE_CAR_NAME.throwErrorMessage()
        }
    }
}
