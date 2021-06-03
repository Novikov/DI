package com.app.ditheory

/**
 * Агрегация это передача зависимости из вне.
 * Computer не знает точно какую реализацию монитора будет использовать.
 * Computer и Monitor имеют разный lifecycle
 * Monitor может быть разделяемым ресурсом для различных Computers
 *
 * Using composition, Server depends on what Repository IS.
 * With aggregation, Server depends on what Repository DOES.
 * */

class Computer(private val monitor: Monitor) {
    fun start(){
        monitor.turnOn()
    }
}

interface Monitor {
    val model:String

    fun turnOn(){
        println("Monitor $model works")
    }
}


