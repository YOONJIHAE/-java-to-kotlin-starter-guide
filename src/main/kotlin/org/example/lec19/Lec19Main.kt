package org.example.lec19

import org.example.lec19.a.printHelloWorld as A;
import org.example.lec19.b.printHelloWorld as B;

data class Person(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}

fun getNumberOrNull(number:Int): Int? {
    return if(number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number:Int): Int? {
    return number.takeIf {it > 0}
}

fun getNumberOrNullV3(number:Int): Int? {
    return number.takeUnless {it <= 0}
}

fun main() {
    A()
    B()

    val person = Person("JH", 999)
    val (name, age) = person
    println("이름 : ${name}, 나이: ${age}")

//    val name = person.component1()
//    val age = person.component2()

    val person2 = Person2("YJH", 123)
    val (name2, age2) = person2
    println("이름 : ${name2}, 나이: ${age2}")

    val numbers = listOf(1,2,3)
    numbers.map { number -> number + 1 }
        .forEach{number -> println(number)}

    numbers.forEach{number ->
        if (number == 2) {
//            return@run
        }
    }

    run {
        numbers.forEach {number ->
            if (number == 2) {
                return@run
            }
        }
    }

    numbers.forEach {number ->
        if (number == 2) {
            return@forEach
        }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }
}