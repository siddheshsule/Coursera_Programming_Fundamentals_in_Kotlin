package DogClass

class Dog(val name: String, var isHungry: Boolean) {
    var hunger = 62
    fun feed() {
        while(isHungry) {
            println("Feeding ${name}. Its hunger level is ${hunger}")
            this.hunger--
            if (hunger == 0) {
                isHungry = false
                println("${name} is not hungry any more")
            }
        }
    }

    fun getHunger() {
        println("${name}'s hunger level is ${hunger}")
    }

    fun setHunger(newHungerValue: Int): Int {
        this.hunger = newHungerValue
        return hunger
    }
}