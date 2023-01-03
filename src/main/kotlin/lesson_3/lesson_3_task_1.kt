package lesson_3

fun main() {

    var greeting = "Добрый день" // Данная переменная перезаписывается
    val nameUser = "Сергей"

    println("$greeting, $nameUser!")

    greeting = "Добрый вечер" //Перезаписываем переменную на вечернее приветствие

    println("$greeting, $nameUser!")
}