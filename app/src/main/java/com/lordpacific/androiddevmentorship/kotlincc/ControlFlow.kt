package com.lordpacific.androiddevmentorship.kotlincc

import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.assignmentGuessingGame
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.assignmentOddEven
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.assignmentTimesTable
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.combineLoopCondition
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.ifElseDemo
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.loopsDemo
import com.lordpacific.androiddevmentorship.kotlincc.ControlFlow.whenDemo
import com.lordpacific.androiddevmentorship.util.Input
import kotlin.random.Random

object ControlFlow {

    fun ifElseDemo() {
        val score = Input.readIntOr("Enter score: ", 0)
        if (score >= 70) println("Excellent")
        else if (score >= 50) println("Pass")
        else println("Fail")
    }

    fun whenDemo() {
        val day = Input.readIntOr("Enter day (1–7): ", 1)
        when (day) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            in 4..5 -> println("Midweek")
            else -> println("Weekend")
        }
    }

    fun loopsDemo() {
        for (i in 1..5) println("Step $i")

        var count = 3
        while (count > 0) {
            println("Countdown: $count")
            count--
        }
        println("Blast off!")

        var x = Input.readIntOr("Enter a number (>=0): ", 1)
        do {
            println("Runs at least once! x=$x")
            x--
        } while (x > 0)
    }

    fun combineLoopCondition() {
        for (i in 1..10) {
            if (i % 2 == 0) println("$i is even") else println("$i is odd")
        }
    }

    // Assignments
    fun assignmentOddEven() {
        val n = Input.readIntOr("Enter a number: ")
        println(if (n % 2 == 0) "Even" else "Odd")
    }

    fun assignmentTimesTable() {
        for (i in 1..12) {
            println("7 x $i = ${7 * i}")
        }
    }

    fun assignmentGuessingGame() {
        val target = Random.nextInt(1, 11)
        var tries = 0
        while (true) {
            val guess = Input.readIntOr("Guess (1..10): ")
            tries++
            when {
                guess > target -> println("Too high.")
                guess < target -> println("Too low.")
                else -> {
                    println("You got it in $tries tries.")
                    return
                }
            }
        }
    }
}

fun main() {
    println("== Conditionals & Loops ==")
    ifElseDemo()
    whenDemo()
    loopsDemo()
    combineLoopCondition()
    assignmentOddEven()
    assignmentTimesTable()
    assignmentGuessingGame()
}
