@file:JvmName("App")

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class Test{
    companion object{
        fun create() = Test()
    }
    fun show(){
        println("in show method")
    }
}
fun main() {
    var obj = Test.create()
    obj.show()
}