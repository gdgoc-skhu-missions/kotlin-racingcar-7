package racingcar.model

data class Car (
    val name: String,
    val position: MutableList<Int> = mutableListOf<Int>(0),
//    var round : MutableList<Boolean>,
)