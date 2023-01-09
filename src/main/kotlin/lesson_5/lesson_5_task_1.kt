package lesson_5

fun main() {
    println("Привет! Для того чтобы войти в приложение, нужно доказать что ты не БОТ!)\nРеши простой пример.\nСколько будет 7 * 8 ?")

    val answer = readLine()!!.toInt()
    if (answer == 56) {
        println("Добро пожаловать !")
    } else {
        println("Доступ запрещён.")
    }
}