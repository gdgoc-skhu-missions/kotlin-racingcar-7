package racingcar

import Car
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.controller.Controller

class RacingTest {
    @Test
    fun `랜덤값이 4 이상이면 전진한다`() {}

    @Test
    fun `랜덤값이 4 미만이면 제자리에 있는다`() {}

    @Test
    fun `가장 많이 움직인 차를 우승자로 선택한다` () {
        val car1 = Car("car1")
        car1.position = 1
        val car2 = Car("car2")
        car2.position = 2
        val car3 = Car("car3")
        car3.position = 2
        val cars = listOf(car1, car2, car3)

        assertThat(Controller.getWinner(cars)).isEqualTo(listOf("car2", "car3"))
    }
}