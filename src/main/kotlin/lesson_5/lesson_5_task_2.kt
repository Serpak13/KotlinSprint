package lesson_5

fun main() {
    println("Введите свой год рождения")
    val userBirth = readLine()!!.toInt()
    val userAge = 2023 - userBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещён")
    }
}

const val AGE_OF_MAJORITY = 18