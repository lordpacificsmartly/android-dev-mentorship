package com.lordpacific.androiddevmentorship.kotlincc

import com.lordpacific.androiddevmentorship.util.Input

fun demoVariables() {
    val country = "Nigeria"       // immutable
    var population = 200_000_000  // mutable

    println("Country: $country")
    println("Population: $population")

    population += 500_000
    println("Updated population: $population")
}

fun demoTypesAndPrint() {
    val age = 25                      // Int
    val price = 19.99                 // Double
    val isAdult = true                // Boolean
    val name = "Jesse"                // String
    println("Name: $name, Age: $age, Price: $price, IsAdult: $isAdult")

    println("Next year you’ll be ${age + 1}")
}

fun handsOn() {
    val name = Input.readLineOrEmpty("What is your name? ")
    val age = Input.readIntOr("How old are you? ", default = 0)
    println("Hello $name, next year you’ll be ${age + 1} years old.")
}

// Assignment from your brief
fun assignment() {
    val name = Input.readLineOrEmpty("Enter your name: ")
    val age = Input.readIntOr("Enter your age: ", default = 0)
    println("Hello $name, in 5 years you will be ${age + 5}.")
}

fun main() {
    println("== Module 1 – Variables, Types, Print ==")
    demoVariables()
    demoTypesAndPrint()
    handsOn()
    assignment()
}