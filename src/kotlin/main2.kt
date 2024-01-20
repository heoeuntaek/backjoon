open class Animal2(var num :Int) {
    open var color: String = ""

    constructor(num :Int, color: String) : this(num) {
        this.color = color
    }

}

class Dog2 : Animal2 {
    var breed: String = ""

    constructor(num : Int, color: String, breed: String) : super(num, color) {
        this.breed = breed
    }




}


//open class Animal2(var color: String) {
//
//
//}
//
//class Dog2(color : String, var breed:String):Animal2(color){





fun main() {
    var anim = Animal2(5,"black")
    println("color = ${anim.color}")

    var dog = Dog2(4,"black", "pub")
    println("${dog.color}  ${dog.breed}")
}