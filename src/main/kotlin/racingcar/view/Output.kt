package racingcar.view
import racingcar.model.Car

object Output {
    fun printGetName() = println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    fun printGetNum() = println("시도할 횟수는 몇 회인가요?")
    fun printResultMessage() = println("실행결과")

    fun printPosition(playerList: List<Car>) {
        for (car in playerList) {
            print(car.name)
            print(":")
            repeat(car.position){ printRoundResult() }
            println()
        }
        println()
    }
    fun printRoundResult() = print("-")
    fun printWinner(winnerList : List<String>) = println("최종 우승자 : ${winnerList.joinToString(",")}")
}