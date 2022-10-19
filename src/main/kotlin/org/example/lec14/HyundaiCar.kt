package org.example.lec14

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> println("아반떼")
        is Grandeur -> println("그랜저")
        is Sonata -> println("소나타")
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 100L)
class Sonata : HyundaiCar("소나타", 200L)
class Grandeur : HyundaiCar("그랜저", 300L)