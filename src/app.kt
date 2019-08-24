import java.util.*

fun main() {

    var humans = TreeMap<String,Int>()
    humans.put("Reza",21)
    humans.put("Shokufeh",23)
    for ((name,age) in humans) println("$name is $age years old!")

}