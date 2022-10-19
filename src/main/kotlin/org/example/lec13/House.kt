package org.example.lec13

fun main() {

}

class JavaHouse(
    private val address: String,
    private val liveRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address
    }

}