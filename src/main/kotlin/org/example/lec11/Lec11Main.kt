package org.example.lec11

val a = 3
private val NUM = 3

fun add(a: Int, b: Int): Int {
    println(NUM)
    return a + b
}

open class Cat protected constructor()
