package com.app.passingarguments

import org.koin.dsl.module

val dataModule = module {
    factory{5}
    factory {A(get())}
}