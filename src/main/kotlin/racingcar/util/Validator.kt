package racingcar.util

import racingcar.util.Error

object Validator {
    fun isBlank(name: String) {
        if (name.isBlank()) {
            Error.notInputCar()
        }
    }

    fun isNumBlack(num: String) {
        if (num.isBlank()) {
            Error.notInputNum()
        }
    }

    fun isNumDigit(n: Char) {
        if (!n.isDigit()) {
            Error.inputNotInt()
        }
    }

    fun checkNumDigit(num: String) {
        for (n in num) {
            isNumDigit(n)
        }
    }

    fun isNumPositive(num: String) {
        if (num.toInt() <= 0) {
            Error.inputNotPositive()
        }
    }

    fun isNumInt(num: String) {
        if (num.toDouble() % 1 != 0.0) {
            Error.inputNotInt()
        }
    }

    fun countName(name: String) {
        if (name.length > 5) {
            Error.overInputCar()
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