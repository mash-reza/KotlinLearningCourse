@file:JvmName("App")

import java.util.*

fun main() {

    var reza = Human()
    var shokufeh = Human()
    reza.skill = "JavaFx"
    shokufeh.skill = "Web developer"
    reza.show()
    shokufeh.show()
    var myGuy = reza + shokufeh
    myGuy.show()

}

infix operator fun Human.plus(person: Human): Human {
    var guy = Human()
    guy.skill = this.skill + " and " + person.skill
    return guy
}