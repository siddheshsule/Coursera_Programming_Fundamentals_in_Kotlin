package Exercises

fun main() {
    val weekday = "Friday"
    val hour = 22
    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday" -> hour >= 8 && hour <= 18
        "Wednesday" -> hour >= 8 && hour <= 18
        "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }

    if (isOpen) println("Little Lemon is open now")
    else println("Little Lemon is closed now")



}