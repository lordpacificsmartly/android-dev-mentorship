# Kotlin Crash Course

---

# Module 1 – Variables, Types, and Print

## 1. Introduction
Before you can build apps, you need to speak the language that the computer understands. In Kotlin, that language starts with **variables** and **types**.  
Think of variables as containers — like buckets. Some buckets can only hold water, others can hold rice. The type of bucket determines what you can put inside.  

Printing is how we "talk back" to the developer — we put information on the screen to check what’s happening inside our program.

---

## 2. Variables in Kotlin
Two main ways to declare variables:

- `val` → sealed bottle (immutable).
- `var` → reusable cup (mutable).

```kotlin
fun main() {
    val country = "Nigeria"  // Immutable
    var population = 200_000_000  // Mutable

    println("Country: $country")
    println("Population: $population")

    population += 500_000
    println("Updated population: $population")
}
````

**Key Idea:**
Use `val` by default. Use `var` only if you must reassign.

---

## 3. Data Types

* `Int` → whole numbers
* `Double` → decimal numbers
* `Boolean` → true/false
* `String` → text

Kotlin infers type automatically:

```kotlin
val age = 25        // Int
val price = 19.99   // Double
val isAdult = true  // Boolean
val name = "Jesse"  // String
```

Explicit type:

```kotlin
val score: Int = 100
```

---

## 4. Printing Output

```kotlin
val name = "Amina"
println("Hello $name")
```

---

## 5. String Templates

```kotlin
val age = 20
println("Next year you’ll be ${age + 1}")
```

---

## 6. Hands-on Demo

```kotlin
fun main() {
    println("What is your name?")
    val name = readLine()
    println("How old are you?")
    val age = readLine()?.toIntOrNull() ?: 0

    println("Hello $name, next year you’ll be ${age + 1} years old.")
}
```

---

## 7. Common Pitfalls

* Forgetting `val` vs `var`
* Mixing types
* Assuming input is always valid

---

## 8. Quick Checkpoints

1. Difference between `val` and `var`?
2. Which type for:

    * Price of cake?
    * User login status?
    * City name?
3. Rewrite Java to Kotlin:

```java
String language = "Kotlin";
System.out.println("I am learning " + language);
```

---

## 9. Assignment

Build a console app asking for **name** and **age**, then print:

```
Hello [name], in 5 years you will be [age + 5].
```

If age is invalid, default to 0.

---

# Module 2 – Conditionals and Loops

## 1. Introduction

Programs decide and repeat actions. Conditionals control flow, loops repeat work.

---

## 2. If/Else

```kotlin
val score = Input.readIntOr("Enter score: ", 0)
if (score >= 70) println("Excellent")
else if (score >= 50) println("Pass")
else println("Fail")
```

---

## 3. Boolean Logic

* `&&` AND
* `||` OR
* `!` NOT

---

## 4. When Expression

```kotlin
val day = Input.readIntOr("Enter day (1–7): ", 1)
when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    in 4..5 -> println("Midweek")
    else -> println("Weekend")
}
```

---

## 5. Loops

### For Loop

```kotlin
for (i in 1..5) println("Step $i")
```

### While Loop

```kotlin
var count = 3
while (count > 0) {
    println("Countdown: $count")
    count--
}
println("Blast off!")
```

### Do-While

```kotlin
var x = Input.readIntOr("Enter a number (>=0): ", 1)
do { 
    println("Runs once!") 
    x--
} while (x > 0)
```

---

## 6. Combining

```kotlin
for (i in 1..10) {
    if (i % 2 == 0) println("$i is even")
    else println("$i is odd")
}
```

---

## 7. Live Demo

```kotlin
println("Enter your exam score:")
val score = readLine()?.toIntOrNull() ?: 0
when {
    score >= 70 -> println("Distinction")
    score >= 50 -> println("Pass")
    else -> println("Fail")
}
```

---

## 8. Assignments

1. Odd/Even Checker
2. Multiplication Table of 7
3. Number Guessing Game with hints

---

# Module 3 – Functions & Null Safety

## 1. Introduction

Functions = reusable recipes.
Null Safety = avoiding crashes from missing values.

---

## 2. Functions

```kotlin
fun greet(name: String): String = "Hello $name"
```

Default parameters:

```kotlin
fun greet(name: String = "Guest") = println("Welcome $name")
```

---

## 3. Null Safety

* `?` → nullable
* `?.` → safe call
* `?:` → Elvis operator
* `!!` → non-null assertion (dangerous)

```kotlin
val input: String? = null
val result = input ?: "Default"
```

---

## 4. Example Function

```kotlin
fun safeLength(text: String?): Int = text?.length ?: 0
```

---

## 5. Assignments

1. `square(num: Int): Int`
2. Welcome function with name + age
3. BMI Calculator with null-safe height

---

# Module 4 – Collections & Functional Operations

## 1. Introduction

Real apps deal with **groups**: Lists, Sets, Maps. Kotlin adds `map`, `filter`, `forEach`.

---

## 2. Lists

Immutable:

```kotlin
val fruits = listOf("Mango", "Apple", "Banana")
```

Mutable:

```kotlin
val shopping = mutableListOf("Milk", "Bread")
shopping.add("Eggs")
```

---

## 3. Sets

```kotlin
val numbers = setOf(1, 2, 2, 3)
println(numbers) // [1,2,3]
```

---

## 4. Maps

```kotlin
val capitals = mapOf("Nigeria" to "Abuja")
println(capitals["Nigeria"])
```

---

## 5. Functional Ops

```kotlin
val nums = (1..10).toList()
nums.filter { it % 2 == 0 }
    .map { it * 10 }
    .forEach { println(it) }
```

---

## 6. Assignments

1. Favorite Movies list
2. Unique Words with a set
3. Phonebook with map
4. Even Numbers Filter with `filter` + `map` + `forEach`