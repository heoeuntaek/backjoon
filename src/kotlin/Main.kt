
class Person {
    var name: String
    var age: Int
    var isMarried: Boolean

    constructor(n: String, a: Int, b: Boolean) {
        name = n
        age = a
        isMarried = b

    }

    fun getName() = println("Your name is ${this.name}")

}

