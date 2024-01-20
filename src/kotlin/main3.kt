class main3() {}

class Person1(var name: String, var age: Int, var isMerried: Boolean) {
    var nickname: String = ""

    init {
        println("시작")
    }


    constructor(_name: String, _age: Int, _isMarried: Boolean, _nickname: String) : this(_name, _age, _isMarried) {
        nickname = _nickname
    }



//    constructor{
//        name ="SDf"
//    }
//        var name: String
//        var age: Int
//        var isMarried: Boolean

//    constructor(n: String, a: Int, b: Boolean) {
//        name = n
//        age = a
//        isMarried = b
//
//    }

    fun getName() = println("Your name is ${this.name}")
    override fun toString(): String {
        return "Person1(name='$name', age=$age, isMerried=$isMerried, nickname='$nickname')"
    }

}


fun main() {
    val ad = Person1("name",21,true)
    print(ad.toString())

}