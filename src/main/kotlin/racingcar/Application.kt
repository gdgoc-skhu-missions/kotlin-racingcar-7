package racingcar

import Car
import racingcar.view.Input
import racingcar.view.Output
import racingcar.controller.Controller
import racingcar.util.CarValidator
import racingcar.util.NumValidator

fun main() {
    Output.printGetName()
    val carNameList = Input.getName().split(",")
    CarValidator.validateCar(carNameList)

    Output.printGetNum()
    val num = Input.getNum()
    NumValidator.validateNum(num.toString())
    val carList = ArrayList<Car>()

    Output.printResultMessage()
    carNameList.forEach { name -> carList.add(Car(name)) }

    for (i in 0..num - 1) {
        Controller.repeatRacing(carList)
        Output.printPosition(carList)
    }

    Output.printWinner(Controller.getWinner(carList))
}
