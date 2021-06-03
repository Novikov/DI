package com.app.ditheory.injection_types.field_di

import java.util.*

/**
 * Возможная альтернатива - создать свойство, значение которого будет инициализировано, после
 * создания экземпляра класса к которому оно принадлежит.
 *
 * Это простое DI через мутатор свойства.
 * */

fun main() {
// 1
    val repository = RepositoryImpl()
    val server = Server()
    server.repository = repository
    val data = Date()
    server.receive(data)
}

class Server () {
    lateinit var repository: Repository
    fun receive(data: Date) {
        repository.save(data)
    }
}

interface Repository{
    fun save(data: Date)
}

class RepositoryImpl: Repository {
    override fun save(data: Date) {
        //
    }
}