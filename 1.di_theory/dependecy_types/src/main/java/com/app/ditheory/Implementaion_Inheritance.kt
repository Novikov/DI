package com.app.ditheory

/**
 * Этого можно добиться по-разному: использовать абстрактный класс вершиной иерархии
 * или реализовать метод общего интерфейса.
 *
 * Используя абстрактный класс или интерфейс мы достигаем полиморфима. Нам не важно кем является сущность,
 * важно что она делает.
 * */

fun main(){
    val persons = listOf(
        Student("Topolino"),
        Musician("Bach"),
        Student("Minnie"),
        Musician("Paganini")
    )
    printNames(persons)
}

fun printNames(persons: List<Person>) {
    persons.forEach {
        println(it.name)
    }
}

abstract class Person(val name: String) {
    open fun think() {
        println("$name is thinking...")
    }
}

class Student(name: String) : Person(name) {
    fun study(topic: String) {
        println("$name is studying $topic")
    }
}
class Musician(name: String) : Person(name) {
    fun play(instrument: String) {
        println("$name is playing $instrument")
    }
}