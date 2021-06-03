package com.app.ditheory.injection_types.method_di

import java.util.*


fun main() {
    val repository = RepositoryImpl()
    val server = Server()
    server.fixRepo(repository) // HERE
    val data = Date()
    server.receive(data)
}

class Server() {
    private var repository: Repository? = null
    fun receive(data: Date) {
        repository?.save(data)
    }
    fun fixRepo(repository: Repository) {
        this.repository = repository
    }
}

/**
 * Тоже самое что и field di, только с помощью методов мы можем делать di для множества зависимостей
 * */


//class Dependent() {
//    private var dep1: Dep1? = null
//    private var dep2: Dep2? = null
//    private var dep3: Dep3? = null
//    fun fixDep(dep1: Dep1, dep2: Dep2, dep3: Dep3) {
//        this.dep1 = dep1
//        this.dep2 = dep2
//        this.dep3 = dep3
//    }
//}

interface Repository{
    fun save(data: Date)
}

class RepositoryImpl: Repository {
    override fun save(data: Date) {
        //
    }
}