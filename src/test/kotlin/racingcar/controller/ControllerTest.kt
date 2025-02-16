package racingcar.controller

import Car
import camp.nextstep.edu.missionutils.Randoms
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ControllerTest {
val testCarList = listOf("a","b","c")
@Test
 fun repeatRacing() {}

  @Test
  fun `난수가 생성되고, 숫자에 맞게 자동차가 움직여야한다`(){
   val car = Car("TestCar")
   val currentRound = Controller.setPosition(car)


  }
  @Test
  fun `경주는 입력받은 숫자 만큼 반복되어야한다`(){}

  @Test
  fun `경주에서 이긴 자동차의 이름이 전부 출력되어야한다 양수가 아닌 음수일때는 생성이 되면 안됨`(){}

  @Test
  fun `경주는 입력받은 숫자 만큼 반복되어한다`(){}
@Test
 fun getWinnerList() {
testCarList.forEach { car -> }
 }
}