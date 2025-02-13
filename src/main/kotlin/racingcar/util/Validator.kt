package racingcar.util

import racingcar.util.Error

object Validator {
    fun isBlank(name: String) {
        if (name.isBlank()) { Error.notInputCar() }
    }
    fun isNumBlack(num: String) {
        if (num.isBlank()) { Error.notInputNum() }
    }
    fun isNumPositive(num: String) {
        if (num.toInt() <= 0) { Error.inputNotPositive() }
    }
    fun countName(name: String) {
        if (name.length >5 ) { Error.overInputCar() }
    }
    fun checkBlank(carList: List<String>) {
        for(car in carList) {
            isBlank((car))
        }
    }
    fun checkNameLength(carList: List<String>) {
        for(car in carList) {countName(car)}
    }
}