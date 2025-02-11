package racingcar.controller

import camp.nextstep.edu.missionutils.Randoms

class Controller {
    fun splitCar(carName : String) : List<String> {
        return carName.split(",")
    }

    fun getRandomNumber() : Int {
        return Randoms.pickNumberInRange(0,9)
    }
    fun getPosition() : Boolean {
        if (getRandomNumber() >= 4) {
            return true
        }
        return false
    }
}
