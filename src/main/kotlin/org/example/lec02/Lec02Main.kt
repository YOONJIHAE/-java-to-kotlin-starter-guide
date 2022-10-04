package org.example.lec02

fun main() {

//    val str: String? = "ABC"
//    str = null
//    println(str?.length ?: 0)
    println(startsWith(null))
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    // nullable type이지만 null이 될 수 없는경우
    return str!!.startsWith("A")
}