package com.app.ditheory

/**
 * Данный тип связи имеет ряд минусов
 * Server knows exactly what the implementation of Repository is.
 * Repository и Server имеют один LifeCycle.
 * A particular instance of Repository belongs to one and only one instance of Server.
 * Therefore, it cannot be shared
 * */

data class Data(val value: Int)
class Repository {
    fun save(data: Data) {
// Save data
    }
}
class Server {
    private val repository = Repository()
    fun receive(data: Data) {
        repository.save(data)
    }
}