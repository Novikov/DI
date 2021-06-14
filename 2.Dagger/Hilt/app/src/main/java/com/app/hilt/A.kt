package com.app.hilt

import javax.inject.Inject

class A @Inject constructor(
    val dependency:String
) {

    fun getInfo():String{
        return "A class + $dependency"
    }
}