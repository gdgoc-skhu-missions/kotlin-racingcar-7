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
        val (_, _, carRoundPosition) = car
        if (currentRound >= 4) {
            carRoundPosition.add(true)
            return car
        }
        carRoundPosition.add(false)
        return car
    }

    fun repeatRacing(carList : List<Car>)  {
        for
    }

}