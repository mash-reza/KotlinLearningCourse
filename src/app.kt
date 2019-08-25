@file:JvmName("App")
interface ThreadKT{
    fun run()
}
fun main() {
    var threadKT = object : ThreadKT {
        override fun run() {
            println("the goddamn thread here in kotlin")
        }
    }
    threadKT.run()
}