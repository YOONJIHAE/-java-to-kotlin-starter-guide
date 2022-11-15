package org.example.lec20


fun main() {
    val person = Person("지혜", 123)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    println("let $value1")
    println("run $value2")
    println("also $value3")
    println("apply $value4")

    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.toUpperCase()
    println(modifiedFirstItem)

    //val person = Person("윤지혜",12).run(personRepository::save)

//    val person = Person("윤지혜",123).run {
//        hobby = ""
//        personRepository.save(this)
//    }}

    mutableListOf("one", "two", "three")
        .also { println("전값: $it") }
        .add("four")

    val numbers2 = mutableListOf("one", "two", "three")
    println("전값: $numbers2")
    numbers2.add("four")

    fun printPerson(person: Person?) {

        if (person != null) {
            println(person.name)
            println(person.age)
        }
    }

    fun printPersonRefactored(person: Person?) {
        person?.let {
            println(it.name)
            println(it.age)
        }
    }

    fun useLetForNonNull(str: String?) {
        val length = str?.let {
            println(it.toUpperCase())
            it.length
        }
        println(length)
    }

}
