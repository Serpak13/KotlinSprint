package lesson_1

fun main() {

    val second:Short= 6480
    //переводим секунды в минуты 6480 / 60 = 108, без остатка
    // либо же 6480 % 60 - выдаёт ноль, т.е. остатка нет
    val wholeMinutes = 108 //Целые минуты
  //  println("${second%60}") - Проверка на остаток
    val remainsSeconds = "00"
    println("Время, проведённое в космосе $wholeMinutes:$remainsSeconds")
}
