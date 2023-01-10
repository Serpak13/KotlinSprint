package lesson_5

import java.util.concurrent.ThreadLocalRandom

fun main() {

    val randomNumOne = ThreadLocalRandom.current().nextInt(1, 100)
    val randomNumTwo = ThreadLocalRandom.current().nextInt(1, 100)

    println("Добро пожаловать в лотерею! Правила просты! Чтобы выиграть главный приз, нужно угадать два числа!")
    println("Введите первое число")
    val numUsOne = readLine()!!.toInt()
    println("Введите второе число")
    val numUsTwo = readLine()!!.toInt()
    //Создаём список
    val numList = listOf(numUsOne, numUsTwo)
    //Условие
    if (numList.contains(randomNumOne) && numList.contains(randomNumTwo)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (numList.contains(randomNumOne) || numList.contains(randomNumTwo)) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача! Крутите барабан")

    println("Выиграшные числа были следующие:\nПервое число - $randomNumOne.\nВторое число - $randomNumTwo.")

}