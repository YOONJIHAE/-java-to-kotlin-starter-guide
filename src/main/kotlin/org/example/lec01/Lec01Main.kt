package org.example.lec01

fun main() {
    var number1: Long = 10L
    val number2 = 10L
    // 연산하게 될 경우 코틀린이 상황에따라서 내부적으로 primitive type으로 바꿔처리한다.
    // nullable 하려면 타입?을 사용
    var number3: Long? = 1_000L
    number3 = null

    // 코틀린에서 객체 인스턴스화를 할때 new를 붙이지않음
    val person = Person("윤지혜")
}