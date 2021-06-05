package com.app.basics

import org.koin.dsl.module

val dataModule = module {
    factory {"Hello"}
}