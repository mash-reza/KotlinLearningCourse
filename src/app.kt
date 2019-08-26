@file:JvmName("App")
class Test{
    companion object{
        @JvmStatic
        fun run(){
            println("fun executed")
        }
    }
}
fun main() {
    Test.run()
}