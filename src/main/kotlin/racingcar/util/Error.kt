package racingcar.util;

enum class Error(val errorMessage: String) {
    NOT_INPUT_CAR("차의 이름을 입력하지 않았습니다."),
    NOT_INPUT_NUM("이동 횟수를 입력하지 않았습니다."),
    INPUT_NOT_POSITIVE("입력값이 1보다 작습니다."),
    INPUT_NOT_INT("입력값이 정수가 아닙니다."),
    OVER_INPUT_CAR("차의 이름이 5자를 초과하였습니다.");

    fun throwErrorMessage():Nothing = throw IllegalArgumentException(errorMessage)
}
