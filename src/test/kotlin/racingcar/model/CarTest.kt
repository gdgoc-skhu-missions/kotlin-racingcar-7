package racingcar.model

import Car
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CarTest {

    @Test
    fun `car의 처음 position은 0이어야한다`() {
        val car = Car("TestCar")
        assertEquals(0, car.position)
    }


    @Test
    fun `move()를 호출하면 위치가 1 증가해야 한다`() {
        val testCar = Car("TestCar")
        testCar.move()
        assertEquals(1, testCar.position,)
        testCar.move()
        assertEquals(2,testCar.position)
    }

}
