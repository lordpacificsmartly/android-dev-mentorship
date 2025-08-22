package com.lordpacific.androiddevmentorship.kotlincc

import com.lordpacific.androiddevmentorship.kotlincc.Collections.assignmentEvenFilterCapstone
import com.lordpacific.androiddevmentorship.kotlincc.Collections.assignmentMovies
import com.lordpacific.androiddevmentorship.kotlincc.Collections.assignmentPhonebook
import com.lordpacific.androiddevmentorship.kotlincc.Collections.assignmentUniqueWords
import com.lordpacific.androiddevmentorship.kotlincc.Collections.functionalOpsDemo
import com.lordpacific.androiddevmentorship.kotlincc.Collections.listsDemo
import com.lordpacific.androiddevmentorship.kotlincc.Collections.mapsDemo
import com.lordpacific.androiddevmentorship.kotlincc.Collections.setsDemo
import com.lordpacific.androiddevmentorship.util.Input

object Collections {

    fun listsDemo() {
        val fruits = listOf("Mango", "Apple", "Banana")
        println("First fruit: ${fruits[0]} (size=${fruits.size})")

        val shopping = mutableListOf("Milk", "Bread")
        shopping.add("Eggs")
        shopping.remove("Bread")
        println("Shopping: $shopping")
    }

    fun setsDemo() {
        val numbers = setOf(1, 2, 2, 3, 4, 4)
        println("Unique: $numbers")
    }

    fun mapsDemo() {
        val capitals = mapOf("Nigeria" to "Abuja", "Ghana" to "Accra", "Kenya" to "Nairobi")
        println("Capital of Nigeria: ${capitals["Nigeria"]}")

        val scores = mutableMapOf<String, Int>()
        scores["Alice"] = 85
        scores["Bob"] = 90
        println("Scores: $scores")
    }

    fun functionalOpsDemo() {
        val nums = (1..10).toList()
        nums.filter { it % 2 == 0 }
            .map { it * 10 }
            .forEach { println(it) }
    }

    // Assignments
    fun assignmentMovies() {
        val movies = mutableListOf("Inception", "Interstellar", "Arrival", "Whiplash", "Parasite")
        movies.add("Dune")
        movies.remove("Arrival")
        println("Updated movies: $movies")
    }

    fun assignmentUniqueWords() {
        println("Enter 6 words:")
        val words = buildList {
            repeat(6) { add(Input.readLineOrEmpty("> ")) }
        }
        val unique = words.toSet()
        println("Unique words: $unique")
    }

    fun assignmentPhonebook() {
        val phonebook = mutableMapOf(
            "Amina" to "0801-000-0000",
            "Jesse" to "0802-111-1111",
            "Samuel" to "0803-222-2222"
        )
        println("Jesse's number: ${phonebook["Jesse"]}")
        phonebook["Chioma"] = "0804-333-3333"
        println("Names: ${phonebook.keys}")
        println("Numbers: ${phonebook.values}")
    }

    fun assignmentEvenFilterCapstone() {
        println("Enter 10 numbers (one per line):")
        val nums = buildList {
            repeat(10) { add(Input.readIntOr("> ")) }
        }
        nums.filter { it % 2 == 0 }
            .map { it * 2 }
            .forEach { println(it) }
    }

}

fun main() {
    println("== Module 4 – Collections & Functional Ops ==")
    listsDemo()
    setsDemo()
    mapsDemo()
    functionalOpsDemo()
    assignmentMovies()
    assignmentUniqueWords()
    assignmentPhonebook()
    assignmentEvenFilterCapstone()
}
