package lesson_5

fun main() {
    //ПЕРВЫЙ ВАРИАНТ
    //println("Добро пожаловать в игру! Для того, чтобы выиграть главный приз, необходимо угадать два числа от 1 до 100.\nВведите первое число")
    //val numOne = readLine()!!.toInt()
   // println("Введите второе число")
   // val numTwo = readLine()!!.toInt()
   // if ((numOne == NUM_ONE && numTwo == NUM_TWO) || (numOne == NUM_TWO && numTwo == NUM_ONE)) {
   //     println("Поздравляем! Вы выиграли главный приз!")
   // } else if ((numOne !== NUM_ONE && numTwo == NUM_TWO) || (numOne == NUM_ONE && numTwo !== NUM_TWO) || (numOne == NUM_TWO && numTwo !== NUM_ONE) || (numOne !== NUM_TWO && numTwo == NUM_ONE)) {
      //  println("Вы выиграли утешительный приз!")
    //} else {
       // println("Неудача! Крутите барабан!")
    //}
    //ВТОРОЙ ВАРИАНТ
    println("Введите первое число")
    val contOne = readLine()!!.toInt()
    println("Введите второе число")
    val contTwo = readLine()!!.toInt()
    val massive = listOf(contOne, contTwo)
    if(massive.contains(NUM_ONE) && massive.contains(NUM_TWO)){
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if(massive.contains(NUM_ONE) || massive.contains(NUM_TWO)){
        println("Вы выиграли утешительный приз!")
    }
    else{
        println("Неудача! Крутите барабан")
    }
}

const val NUM_ONE = 13
const val NUM_TWO = 58