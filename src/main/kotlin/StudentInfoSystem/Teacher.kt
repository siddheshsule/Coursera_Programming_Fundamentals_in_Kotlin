package StudentInfoSystem

class Teacher (
    val lastName: String,
    val firstName: String,
    val birthday: String,
    val status: String
    ) {
    val details: String = "Full Name: ${this.lastName}, ${this.firstName}\n" +
            "Date of Birth: ${birthday}\n" +
            "Status: ${status}"
}