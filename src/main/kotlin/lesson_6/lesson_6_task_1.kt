package lesson_6

fun main() {

    println("Создайте логин")
    val logUser = readLine()
    println("Придумайте пароль")
    val passUser = readLine()
    println("Регистрация прошла успешно")

    //Авторизация

    //Создаём цикл
    do{
        println("Введите логин")
        val logEnter = readLine()
        println("Введите пароль")
        val passEnter = readLine()
    }while(logEnter != logUser && passEnter != passUser)

    println("Авториизация прошла успешно")

}