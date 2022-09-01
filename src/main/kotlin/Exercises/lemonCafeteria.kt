package Exercises

fun main() {
    val weekday = "Friday"
    val openingHours = when(weekday) {
        "Monday" -> "8 AM to 12 PM"
        "Tuesday" -> "8 AM to 6 PM"
        "Wednesday" -> "8 AM to 6 PM"
        "Thursday" -> "8 AM to 6 PM"
        "Friday" -> "8 AM to 9 PM"
        "Saturday" -> "9 AM to 4 PM"
        "Sunday" -> "8 AM to 4 PM"
        else -> "Invalid Day entered!"
    }
    println("On $weekday, the opening hours are: $openingHours")
}