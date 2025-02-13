package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.util.Validator

object Input {

    fun getName(): String = Console.readLine()

    fun getNum(): Int {
        val num = Console.readLine()
        Validator.isNumBlack(num)
        Validator.checkNumDigit(num)
        Validator.isNumInt(num)
        Validator.isNumPositive(num)
        return num.toInt()
    }
}