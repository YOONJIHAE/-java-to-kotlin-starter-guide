package org.example.lec03

fun main() {
//    val number1 = 3
//    val number2: Long = number1.toLong()
//    val result = number1 /  number2.toDouble()
//
//    println(number1 + number2)
//    println(result)

//    printAgeIfPersonNullable(null)
//    printAgeIfPersonNullable(Person("", 100))

//    val person = Person("윤지혜", 100)
//    println("이름 : ${person.name}")

//    val str = """
//        ABC
//        EFG
//    """.trimIndent()
//    println(str)

    val str = "ABC"
    println(str[0])

}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
        // 스마트 캐스트
        println(obj.age)
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}