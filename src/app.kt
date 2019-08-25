@file:JvmName("App")

import java.util.ArrayList

data class Book(var name : String,var price : Int)
object BookShelf {
    var books = arrayListOf<Book>()
    fun printBooks(){
        for (i in books) println(i)
    }
}

fun main() {
    BookShelf.books.add(Book("Java", 1000))
    BookShelf.books.add(Book("JavaFx", 1500))
    BookShelf.books.add(Book("C", 5000))
    BookShelf.printBooks()

}