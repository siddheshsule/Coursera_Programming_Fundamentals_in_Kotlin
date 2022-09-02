package practiceGame



fun main() {

//    val name1 = User("Nicola", "Tesla")
//
//    println(name1.fullName()) // Nicola Tesla
//
//    val name2 = User("Thomas", "Edison")
//
//    println(name2.fullName()) // Thomas Edison
//
//    // from NumbersStats
//
//    val stats = NumbersStats()
//
//    stats.addNumber(3)
//
//    stats.addNumber(5)
//
//    stats.addNumber(1)
//
//    stats.addNumber(2)
//
//    println(stats.count) // 4
//
//    println(stats.sum) // 11
//
//    println(stats.calculateAverage()) // 2.75

    // From BestScore

    val bestScore = BestScore()

    bestScore.printPersonalBest() // No stored scores yet

    bestScore.registerScore("Aleb", 123)

    bestScore.printPersonalBest() // Best score: 123 by Aleb

    bestScore.registerScore("Baal", 56)

    bestScore.printPersonalBest() // Best score: 123 by Aleb

    bestScore.registerScore("Crux", 432)

    bestScore.printPersonalBest() // Best score: 432 by Crux
}