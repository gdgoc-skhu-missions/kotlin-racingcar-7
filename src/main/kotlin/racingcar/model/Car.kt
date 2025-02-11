package racingcar.model

data class Car (
    val name: String,
    val position: Int = 0,
    val round : List<String>
)