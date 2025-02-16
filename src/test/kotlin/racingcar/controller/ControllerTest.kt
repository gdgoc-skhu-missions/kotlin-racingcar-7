package racingcar.controller

import Car
import camp.nextstep.edu.missionutils.Randoms
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import racingcar.controller.Controller.getWinner
import racingcar.controller.Controller.repeatRacing
import racingcar.controller.Controller.startRacingGame

class ControllerTest {
    val testCarList = listOf<Car>(Car("a"), Car("b"), Car("c"))

    @Test
    fun `숫자가 4 이상이므로 위치가 한 칸 이동 해야한다`() {
        val car = Car("TestCar")
        assertEquals(0, car.position)

        startRacingGame(car, 4)
        assertEquals(1, car.position)

    }

    @Test
    fun `숫자가 4 미만이므로 위치가 이동하지 않아야한다`() {
        val car = Car("TestCar")
        assertEquals(0, car.position)

        startRacingGame(car, 3)
        assertEquals(0, car.position)

    }

    @Test
    fun `한 회차당 레이싱은 입력받은 자동차의 수 만큼 반복된다`() {
        repeatRacing(testCarList)
        assertEquals(3, testCarList.size)

    }

    @Test
    fun `가장 높은 위치를 가진 자동차가 우승자로 반환 되어야한다`() {
        testCarList[0].move()
        testCarList[2].move()
        testCarList[2].move()
        val winners = getWinner(testCarList)
        assertEquals(listOf("c"), winners)
    }

    @Test
    fun `가장 높은 위치의 자동차가 다수일 때, 모두 출력되어야한다`() {
        testCarList[0].move()
        testCarList[2].move()
        val winners = getWinner(testCarList)
        assertEquals(listOf("a", "c"), winners)
    }
}
