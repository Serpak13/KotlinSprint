package lesson_3

fun main() {
    //Вводные данные
    val info = "D2-D4;0"
    //Выводим отдельные переменные
    val startMotion = info.substringBefore("-") // откуда
    val finishMotion = info.substringAfter("-").substringBefore(";")//куда
    val numberMotion = info.substringAfter(";") // номер хода

    println(startMotion)
    println(finishMotion)
    println(numberMotion)

}