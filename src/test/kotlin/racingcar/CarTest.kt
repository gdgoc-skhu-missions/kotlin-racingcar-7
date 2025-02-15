package racingcar

import Car
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `전진하는 경우 position이 1증가한다`() {
        val car = Car("car")
        car.move()
        assertThat(car.position).isEqualTo(1)
    }
}