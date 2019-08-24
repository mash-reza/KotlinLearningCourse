@file:JvmName("App")
import java.util.*

fun main() {

    var result = add(2,4)
    println(result)
}
@JvmOverloads
fun add(a : Int, b : Int, c : Int = 5) : Int = a+b