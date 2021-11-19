fun main() {

}

// doesn't compile without open
open class Dog : Animal {
    override val name = "dog"
    override val sound = "woof"
}

class Chicwawa : Dog() {
    override val sound = "yip"
}

interface Animal {
    val name: String
    val sound: String
    fun makeSound() = println(sound)
}