package com.huongdankotlin.kotlincoroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {
        launch {
            delay(1000L)
            println("From Huong Dan Kotlin!" + " Thread: " + Thread.currentThread().name)
        }

        println("Hello" + " Thread: " + Thread.currentThread().name)
    }

    println("Done" + " Thread: " + Thread.currentThread().name)
}