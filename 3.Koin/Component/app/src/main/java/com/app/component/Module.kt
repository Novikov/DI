package com.app.component

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module{
    factory (named("first")){ "Hello 1" }
    factory (named("second")){ "Hello 2" }
}
