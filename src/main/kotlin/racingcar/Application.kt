package racingcar

import Car
import racingcar.view.Input
import racingcar.view.Output
import racingcar.controller.Controller

fun main() {
    Output.printGetName()
    val carNameList = Input.getName().split(",")

    Output.printGetNum()
    val num = Input.getNum()
    val carList = ArrayList<Car>()

    Output.printResultMessage()
    carNameList.forEach{name -> carList.add(Car(name))}

    for(i in 0..num-1){
        Controller.repeatRacing(carList)
        Output.printPosition(carList)
    }

    Output.printWinner(Controller.getWinner(carList))
}
