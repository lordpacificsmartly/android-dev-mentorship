package com.lordpacific.androiddevmentorship.kotlincc

import com.lordpacific.androiddevmentorship.kotlincc.FunctionsNulls.runDemos
import com.lordpacific.androiddevmentorship.util.Input


object FunctionsNulls {

    // Function examples
    fun greet(name: String): String = "Hello $name"

    fun greetWithDefault(name: String = "Guest") {
        println("Welcome, $name")
    }

    fun safeLength(text: String?): Int = text?.length ?: 0

    // Assignments
    fun square(num: Int): Int = num * num

    fun welcome(name: String, age: Int = 0) {
        println("Welcome $name, next year you’ll be ${age + 1}.")
    }

    fun calculateBMI(weight: Double, height: Double?): String {
        val h = height ?: return "Height not provided."
        val bmi = weight / (h * h)
        return when {
            bmi < 18.5 -> "Underweight"
            bmi < 25.0 -> "Normal"
            else -> "Overweight"
        }
    }

    fun runDemos() {
        println(greet("Amina"))
        greetWithDefault()
        greetWithDefault("Samuel")
        println("safeLength(null) = ${safeLength(null)}")
        println("square(4) = ${square(4)}")

        val name = Input.readLineOrEmpty("Name: ")
        val age = Input.readIntOr("Age (default 0 if invalid): ", 0)
        welcome(name, age)

        val w = Input.readDoubleOr("Weight (kg): ", 70.0)
        val h = Input.readLineOrEmpty("Height (m) or blank: ").toDoubleOrNull()
        println("BMI category: ${calculateBMI(w, h)}")
    }
}

fun main() {
    println("== Functions & Null Safety ==")
    runDemos()
}
