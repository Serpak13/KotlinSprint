package lesson_10

//Задача 2 к Уроку 10
//
//Для регистрации в приложении пользователь придумывает логин и пароль.
// И пароль, и логин должны содержать в себе хотя бы 4 символа.
// Если всё верно, программа выводит приветственное сообщение.
//
// – логин и пароль должны считываться с консоли;
// – проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
// – если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
fun main() {
    println("Введите логин")
    val logUs = readLine()
    println("Введите пароль")
    val passUs = readLine()
    validateLogAndPassLength(logLen = logUs!!, passLen = passUs!!)

}

//Функция проверки логина и пароля

fun validateLogAndPassLength(logLen: String, passLen: String): Boolean.Companion {
    if (logLen.length > 4 && passLen.length > 4) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные !")

    return Boolean
}