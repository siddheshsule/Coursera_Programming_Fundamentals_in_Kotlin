package Exercises

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val score = scanner.nextInt()

    val result = when(score) {
        in 0..2 -> "You need to practice more!"
        in 3..5 -> "Can do much Better!"
        else -> "Excellent Job!"
    }
    println(result)
}