package lesson_5


fun main() {
    println("Введите логин")
    val logUs = readLine()
    if(logUs == LOGIN_USER){
        println("Пользователь зарегистрирован")
    }
    else {
        println("Требуется регистрация")
        return
    }

    println("Введите пароль")
    val passUs = readLine()
    if(passUs == PASSWORD_USER){
        println("Привет Брюс, Готэм ждёт своего рыцаря!")
    }
    else println("Ошибка авторизации")
}

const val LOGIN_USER =  "Batman"
const val PASSWORD_USER = "password"