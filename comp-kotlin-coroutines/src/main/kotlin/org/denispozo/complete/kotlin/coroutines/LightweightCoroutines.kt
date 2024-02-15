package org.denispozo.complete.kotlin.coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        repeat(100_000) {
            launch {
                print(".")
            }
        }
    }
}
