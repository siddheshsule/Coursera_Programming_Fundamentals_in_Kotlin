package Exercises

fun main() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        val numberOfStars = 6 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
            for (j in 1..numberOfStars){

                print("*")
            }
            println()
        }
    }
}