package com.app.component

import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.core.qualifier.named

class MyComponent : KoinComponent {
    val first:String by inject(qualifier = named("first"))
    val second:String by inject(qualifier = named("second"))
}