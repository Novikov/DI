package com.app.ditheory.dependency_types

/**
 * Реализация Dependency Inversion Principle
 * Мы можем использовать тип интерфейса и подменять его реализации
 * Используя данный паттерн мы можем нормально протестировать наш класс.
 * Используя композицию этого сделать не получиться. Там жестко зашита зависимость.
 * */

interface Engine {
    fun ignition()
}

class OneGZ : Engine {
    override fun ignition() {
        println("1GZ is working")
    }
}