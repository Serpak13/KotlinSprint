package lesson_10

//Задача 5 к Уроку 10
//
//Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа),
// генерацию пароля для него и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр (случайное число от 1000 до 9999).
// Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.
//
//Алгоритм действий:
//1. Регистрация
// – пользователь придумывает логин (длина должны быть более 4 символов);
// – программа генерирует пароль и отображает его пользователю;
//
//2. Авторизация
// – программа предлагает авторизоваться, пользователь вводит логин и пароль;
// – если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
// – если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
// – если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.
//
//Действия в программе должны быть распределены по соответствующим методам без дублирования кода.
fun main() {
    println("Придумайте логин")
    val logUser = readLine()
    validateLogLength(logLen = logUser!!)                  //Проверка длины логина
    val passReg = getRandomPassword()              //Генерация пароля
    println(passReg)

    println("Введите логин")
    val checkLogin = readLine()                     //Проверка Логина
    println("Введите пароль")
    val checkPassword = readLine()                  // Проверка Пароля
    if (checkLogin == logUser && checkPassword == passReg) {
        println("Авторизация пройдена успешно")
    } else {
        do {
            println("Неверный логин или пароль. Попробуйте снова")
            println("Введите логин")
            val tryLog = readLine()
            println("Введите пароль")
            val tryPass = readLine()
        } while (tryLog != logUser && tryPass != passReg)
        println("Авторизация пройдена успешно")
    }
    fourCode() // Генерация кода из смс

}

//Проверка длины логина
fun validateLogLength(logLen: String): Boolean.Companion {
    if (logLen.length > 4) {
        println("Логин принят. Сейчас вы получите сгенерированный пароль ")
    } else {
        do {
            println("Длина логина должна быть более 4х символов. Попробуйте ещё раз")
            val logTry = readLine()
        } while (logTry?.length!! < 4)
        println("Логин принят. Сейчас вы получите сгенерированный пароль")
    }
    return Boolean
}

// ГЕНЕРАЦИЯ ПАРОЛЯ

fun getRandomPassword(): String {
    val charset =  (('0'..'9') + ("!@#$%^&*()<>-{}[]<>`~:;№=+*/") + ('a'.. 'z') + ('A'..'Z')).toString()
    return (1..10)
        .map { charset.random() }
        .joinToString("")
}

//Генерация кода
fun fourCode() {
    var code = (1000..9999).random()
    println("Ваш код: $code")
    println("Введите 4ёх значный код из смс")
    var codeUser = readLine()!!.toInt()
    if (codeUser == code) {
        println("Регистрация прошла успешно")
    } else {
        do {
            println("Введён неверный пароль, Попробуйте снова!")
            code = (1000..9999).random()
            println("Ваш код: $code")
            println("Введите 4ёх значный код из смс")
            codeUser = readLine()!!.toInt()
        } while (codeUser != code)
        println("Регистрация прошла успешно")
    }

}

