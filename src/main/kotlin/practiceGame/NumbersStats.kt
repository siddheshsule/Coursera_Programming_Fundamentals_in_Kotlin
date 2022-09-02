package practiceGame

class NumbersStats {

    var sum: Int = 0

    var count: Int = 0

    // Implement calculateAverage method here
    // Implement addNumber method here

    fun calculateAverage() = sum.toDouble() / count

    fun addNumber(num: Int) {

        sum += num

        count += 1
    }
}