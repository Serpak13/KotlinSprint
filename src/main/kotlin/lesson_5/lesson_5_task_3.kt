package lesson_5

fun main() {
    println("Добро пожаловать в игру! Для того, чтобы выиграть главный приз, необходимо угадать два числа от 1 до 100.\nВведите первое число")
    val numOne = readLine()!!.toInt()
    println("Введите второе число")
    val numTwo = readLine()!!.toInt()
    if ((numOne == NUM_ONE && numTwo == NUM_TWO) || (numOne == NUM_TWO && numTwo == NUM_ONE)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((numOne !== NUM_ONE && numTwo == NUM_TWO) || (numOne == NUM_ONE && numTwo !== NUM_TWO) || (numOne == NUM_TWO && numTwo !== NUM_ONE) || (numOne !== NUM_TWO && numTwo == NUM_ONE)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }
}

const val NUM_ONE = 13
const val NUM_TWO = 58