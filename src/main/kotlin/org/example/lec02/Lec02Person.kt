package org.example.lec02

fun main() {
    val person = Person(null)
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}