package com.santiihoyos.kmmtest1

class Greeting {

    fun saluda(name: String): String {
        return "Hello $name, you are using ${Platform().platform}!"
    }
}
