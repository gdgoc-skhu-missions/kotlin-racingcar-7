package racingcar

import Car
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.util.Validator

class ValidateTest {
    @Test
    fun`자동차 이름이 빈칸이면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.isBlank("")
        }
    }
    @Test
    fun `회차 수가 빈칸이면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.isNumBlack("")
        }
    }
    @Test
    fun `회차 수가 숫자가 아니면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.isNumDigit('c')
        }
    }
    @Test
    fun `회차 수가 양수가 아니면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.isNumPositive("-2")
        }
    }
    @Test
    fun `회차 수가 정수가 아니면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.isNumInt("2.2")
        }
    }
    @Test
    fun `차 이름이 5자 이상이면 예외가 발생한다`(){
        assertThrows<IllegalArgumentException> {
            Validator.countName("qwerty")
        }
    }
}