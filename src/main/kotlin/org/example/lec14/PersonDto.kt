package org.example.lec14

fun main() {
    val dto1 = PersonDto("지혜", 100)
    val dto2 = PersonDto("지혜", 300)

    println(dto1.age)
}

data class PersonDto(
    val name: String,
    val age: Int,

)
