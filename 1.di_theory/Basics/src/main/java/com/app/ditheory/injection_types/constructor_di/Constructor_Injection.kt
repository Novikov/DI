package com.app.ditheory.injection_types.constructor_di

import java.util.*

/**
 * Мы не можем создать сервер без передачи ссылки на репозиторий. Сервер зависит от него.
 * Модификатор private делает свойство repository readonly, а Server immutable.
 * Это лучший тип di которого мы можем достичь, только если имеем доступ к создания компонента.
 * */

private class Server(private val repository: Repository) {
    fun receive(data: Date) {
        repository.save(data)
    }
}

private interface Repository {
fun save(data: Date)
}

private class RepositoryImpl():Repository {
    override fun save(data:Date) {
        //
    }
}
