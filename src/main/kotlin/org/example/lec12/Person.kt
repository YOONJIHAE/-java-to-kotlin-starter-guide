package org.example.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("무브므브")
        }

        override fun fly() {
            println("날아날아")
        }
    })
}

class Person(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("person class의 동행객체이다.")
        }
    }
}

object Singleton {
    var a = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}