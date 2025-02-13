package racingcar.controller

import Car
import camp.nextstep.edu.missionutils.Randoms

object Controller {

    private fun getRandomNumber(): Int = Randoms.pickNumberInRange(0, 9)

    private fun setPosition(car: Car): Car {
        val currentRound = getRandomNumber()

        if (currentRound >= 4) {
            car.move()
            return car
        }
        return car
    }

    fun repeatRacing(carList: List<Car>) {
        carList.forEach { car -> setPosition(car); }
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