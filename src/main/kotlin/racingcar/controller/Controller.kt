package racingcar.controller
import camp.nextstep.edu.missionutils.Randoms
import racingcar.model.Car

object Controller {
//    fun splitCarName(carName : String) : List<String> = carName.split(",")

    fun getRandomNumber() : Int = Randoms.pickNumberInRange(0,9)

//    fun getPosition(arr : ArrayList<List<String>>):ArrayList<ArrayList<String>>  {
//    val currentRound = getRandomNumber()
//    if (currentRound >= 4) {
//
//    }

    fun setPosition(car: Car): Car { //전진 여부 결정 함수
        val currentRound = getRandomNumber()
        if (currentRound >= 4) {
            car.position += 1
            return car
        }
        return car
    }

    fun repeatRacing(carList : List<Car>) { // 차를 전진시킴
        carList.forEach{car -> setPosition(car);}
    }

    fun getWinnerScore(carList: List<Car>) : Int {
        var score = ArrayList<Int>()
        carList.forEach{car -> score.add(car.position)}
        return score.max()
    }

    fun getWinner(carList: List<Car>) : List<String> {
        val winnerScore = getWinnerScore(carList)
        var winnerList = ArrayList<String>()
        for (car in carList) {
            if (winnerScore == car.position) {
                winnerList.add(car.name)
            }
        }
        return winnerList
    }
}