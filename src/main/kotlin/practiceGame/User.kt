package practiceGame

class User(val name: String, val surname: String) {

    // Implement fullName method here
    fun fullName(): String {
        return "${name} ${surname}"
    }

}