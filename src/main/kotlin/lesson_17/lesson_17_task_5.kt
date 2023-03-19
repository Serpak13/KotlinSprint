package lesson_17

//Задача 5 к Уроку 17
//
//Написать класс, описывающий пользователя. У него есть логин и пароль.
// При попытке изменить пароль в консоль должно выводиться «Вы не можете изменить пароль».
// При попытке прочитать его – вместо букв должны отображаться звездочки (по количеству символов пароля).
// При изменении логина в консоли должно печататься сообщение об успешной смене логина.
//
//Создай пользователя с произвольными данными и протестируй изменение логина и пароля. Вся реализация должна быть на сеттерах и геттерах.
fun main() {
    val user1 = User("Tony", "qwerty132")
    println("Ваш пароль: ${user1.password}")
    user1.password = "asdiop6540"
    println(user1.password)
    user1.login = "John"
    println(user1.login)
}

class User(private val loginUser: String, private val passwordUser: String) {
    var password = passwordUser
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")
    var login = loginUser
        set(value){
            field = value
            println("Логин изменён успешно")
        }
}