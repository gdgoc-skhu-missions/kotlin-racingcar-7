package racingcar.view

object Output {
    fun printGetName() {
        print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    }
    fun printGetNum() {
        print("시도할 횟수는 몇 회인가요?")
    }
    fun printResult() {
        print("실행결과")
    }
    fun printPosition() {

    }
    fun printWinner(winnerList : List<String>) { //리스트를 String으로 받아도 될 지 모르겠는데 일단 함
        print(winnerList.joinToString(",")) //winner리스트를 ,로 구분된 문자열로 만들어 print
    }
}