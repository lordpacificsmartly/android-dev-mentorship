package com.lordpacific.androiddevmentorship.util

object Input {

    fun readLineOrEmpty(prompt: String): String {
        print(prompt)
        return readLine()?.trim().orEmpty()
    }

    fun readIntOr(prompt: String, default: Int = 0): Int {
        print(prompt)
        return readLine()?.trim()?.toIntOrNull() ?: default
    }

    fun readDoubleOr(prompt: String, default: Double = 0.0): Double {
        print(prompt)
        return readLine()?.trim()?.toDoubleOrNull() ?: default
    }
}