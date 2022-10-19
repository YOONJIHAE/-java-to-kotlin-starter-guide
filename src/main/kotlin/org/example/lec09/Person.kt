package org.example.lec09

fun main() {
//    val person = Person("지혜", 27)
//    val person = Person("JIHAE")
//    println(person.name)
//
//    person.age = 10
//    println(person.age)
//
//    Person()
}

class Person(name: String, var age: Int) {

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

//    val upperCaseName: String = name
//        get() = field.uppercase()

//    var name: String = name
//        set(value) {
//            field = value.uppercase()
//        }

//    constructor(name: String): this(name, 1) {
//        println("첫번째 부생성자")
//    }
//    constructor(): this("YOONJIHAE") {
//        println("두번쨰 부생성자")
//    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean get() = this.age >= 20

}