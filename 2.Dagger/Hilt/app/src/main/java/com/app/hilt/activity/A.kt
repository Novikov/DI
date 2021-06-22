package com.app.hilt.activity

import com.app.hilt.activity.ActivityString
import javax.inject.Inject

class A @Inject constructor(
   @ActivityString val dependency:String
) {

    fun getInfo():String{
        return "A class + $dependency"
    }
}