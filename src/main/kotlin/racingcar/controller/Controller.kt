package racingcar.controller
import camp.nextstep.edu.missionutils.Randoms
import racingcar.model.Car

class Controller {
    fun splitCarName(carName : String) : List<String> = carName.split(",")

    fun getRandomNumber() : Int = Randoms.pickNumberInRange(0,9)

//    fun getPosition(arr : ArrayList<List<String>>):ArrayList<ArrayList<String>>  {
//    val currentRound = getRandomNumber()
//    if (currentRound >= 4) {
//
//    }

    fun setPosition(car: Car): Car {
        val currentRound = getRandomNumber()
        var (_, position) = car
        if (currentRound >= 4) {
            position.add(position.last()+1)
            return car
        }
        position.add(position.last())
        return car
    }

    fun repeatRacing(carList : List<Car>, num: Int) {
        for(i in 0 until num) {
            carList.forEach{car -> setPosition(car);}
        }
    }

    fun getWinnerScore(carList: List<Car>) : Int {
        var score = ArrayList<Int>()
        carList.forEach{car -> score.add(car.component2().last());}
        return score.max()
    }

    fun getWinner(winnerScore : Int, carList: List<Car>) : List<String> {
        var winnerList = ArrayList<String>()
        for (car in carList) {
            if (winnerScore == car.component2().last()) {
                winnerList.add(car.component1())
            }
        }
        return winnerList
    }
}