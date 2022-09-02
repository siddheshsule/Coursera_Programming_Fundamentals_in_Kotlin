package practiceGame

class BestScore {
    var scoreStored: Boolean = false

    var score: Int = Int.MIN_VALUE

    var name: String = ""

    // Implement printPersonalBest method here

    fun printPersonalBest() {
        if(scoreStored == false) {
            println("No stored scores yet")
        } else {
            println("Best score: ${score} by ${name}")
        }
    }

    // Implement registerScore method here

    fun registerScore(name: String, score: Int) {
        if (this.score < score || scoreStored == false) {
            this.score = score
            this.name = name
            scoreStored = true
        }
    }

}