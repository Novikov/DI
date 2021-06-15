package com.app.passingarguments

import org.koin.dsl.module

val dataModule = module {
    single {(params:Integer) -> A(params)}
}