class Human(var name: String = "") {

    private var age: Int = 0

    constructor(age: Int, name: String) : this(name) {
        this.age = age
    }

    fun think() {
        println("name is $name and age is $age")
    }
}
