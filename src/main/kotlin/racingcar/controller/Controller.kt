package racingcar.controller

import Car
import camp.nextstep.edu.missionutils.Randoms

object Controller {

    //  fun splitCarName(carName : String) : List<String> = carName.split(",")
    private fun getRandomNumber(): Int = Randoms.pickNumberInRange(0, 9)

    private fun setPosition(car: Car): Car { //전진 여부 결정 함수
        val currentRound = getRandomNumber()

        if (currentRound >= 4) { // 전진이 4이상이면
            car.move()
            return car
        }
        return car
    }

    fun repeatRacing(carList: List<Car>) { // 카 리스트를 반복해서 레이싱 경주 시키기
        carList.forEach { car -> setPosition(car); }
    }

    private fun getWinnerScore(carList: List<Car>): Int { // 위너 점수 저장
        val score = ArrayList<Int>()
        carList.forEach { car -> score.add(car.position) }
        return score.max()
    }

    fun getWinner(carList: List<Car>): List<String> =
        carList.filter { it.position == getWinnerScore(carList) }
            .map { it.name }

}
