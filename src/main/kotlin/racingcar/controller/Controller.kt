package racingcar.controller

import Car
import camp.nextstep.edu.missionutils.Randoms

object Controller {
    private const val MIN_RANGE = 0;
    private const val MAX_RANGE = 9;
    private const val MOVABLE_NUMBER = 4;

    private fun getRandomNumber(): Int = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE)

    //    fun setPosition(car: Car): Car {
//        val currentRound = getRandomNumber()
//
//        if (currentRound >= MOVABLE_NUMBER) {
//            car.move()
//            return car
//        }
//        return car
//    }
    fun setPosition(car: Car): Car {
        car.move()
        return car
    }

    fun alwjd(car: Car, randomNumber: Int): Car {
        if (randomNumber >= MOVABLE_NUMBER) {
            setPosition(car)
            return car
        }
        return car
    }

    fun repeatRacing(carList: List<Car>) {
        carList.forEach { car -> alwjd(car, getRandomNumber()) }
      //  carList.forEach { car -> setPosition(car); }
    }

    private fun getWinnerScore(carList: List<Car>): Int {
        val score = ArrayList<Int>()
        carList.forEach { car -> score.add(car.position) }
        return score.max()
    }

    fun getWinner(carList: List<Car>): List<String> =
        carList.filter { it.position == getWinnerScore(carList) }
            .map { it.name }

}
