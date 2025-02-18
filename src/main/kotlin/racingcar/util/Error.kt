package racingcar.util;

object Error {
    fun notInputCar(): IllegalArgumentException = throw IllegalArgumentException("차의 이름을 입력하지 않았습니다.")
    fun notInputNum(): IllegalArgumentException = throw IllegalArgumentException("이동 횟수를 입력하지 않았습니다.")
    fun inputNotPositive(): IllegalArgumentException = throw IllegalArgumentException("입력값이 1보다 작습니다.")
    fun inputNotInt(): IllegalArgumentException = throw IllegalArgumentException("입력값이 정수가 아닙니다.")
    fun overInputCar(): IllegalArgumentException = throw IllegalArgumentException("차의 이름이 5자를 초과하였습니다.")
}