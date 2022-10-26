package org.example.lec16

fun main() {
    val value = "JIHAE"
    println(value.lastChar())

    val person = Person("A","B",27)
    println(person.nextYearAge())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장함수")
    return this.age - 1
}