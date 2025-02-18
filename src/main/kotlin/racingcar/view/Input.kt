package racingcar.view

import camp.nextstep.edu.missionutils.Console

object Input {

    fun getName(): String = Console.readLine()

    fun getNum(): Int =
        Console.readLine().toInt()

}
