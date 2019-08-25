@file:JvmName("App")
interface A {
    fun show()
    fun imagine(){

    }
}
interface B{
    fun display()
    fun imagine(){

    }
}
class C : A,B{
    override fun show() {
    }

    override fun display() {
    }

    override fun imagine() {
    }
}

fun main() {


}