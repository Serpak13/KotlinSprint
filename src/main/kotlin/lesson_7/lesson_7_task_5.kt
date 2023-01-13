package lesson_7


//Задача 5 к Уроку 7
//
//Создай программу, которая генерирует более сложные пароли.
//
// – пароль должен содержать цифры, строчные и заглавные буквы;
// – цифры и буквы должны располагаться в случайном порядке;
// – длина пароля должна задаваться пользователем.

fun getRandomString(length: Int) : String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun main() {
    println("Укажите длину пароля, т.е. количество символов")
    val length = readLine()!!.toInt()

    val randomString = getRandomString(length)

    println(randomString)
}