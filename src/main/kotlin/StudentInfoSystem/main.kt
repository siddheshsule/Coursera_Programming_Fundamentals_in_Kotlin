package StudentInfoSystem

fun main() {
    val jolieAngelina = Teacher("Jolie", "Angelina", "28th Sep, 1975","In service")
    val gadotGal = Teacher("Gadot", "Gal", "15th April, 1980", "In service")

    val computerScience = Subject("Computer Science", gadotGal, true)
    val networking = Subject("Networking", jolieAngelina, true)

    println(networking.isObligatory)
    println(computerScience.dozent.details)
}