open class Animal(open var color: String) {
    init{
        println("init animal color : $color")
    }

}

class Dog(override var color: String, var breed:String): Animal(color){
    init {
        println("dog init : $breed")
    }
}

fun main(){
    val animal = Animal("white")
    val dog = Dog("red", "sdf")
    println(animal.color)

    println(dog.color)
}