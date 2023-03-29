package lesson_11

//Задача 1 к Уроку 11
//
//Создай класс, который будет хранить данные пользователя.
// В свойствах должна храниться информация об уникальном идентификаторе, логине, пароле и почте.
// Названием может быть, например, User. Создай два экземпляра класса с произвольными данными и выведи их в консоль.
fun main() {
    val user1 = User(
        id = 9,
        login = "Tony",
        password = "Jarvis",
        mail = "ironman@shield.com",
    )

    val user2 = User(
        id = 20,
        login = "Thor",
        password = "PointBreak",
        mail = "godofasgard@shield.com",
    )
    println("Данные по пользовтаель №1")
    println("Идентификационный номер : ${user1.id}")
    println("Логин : ${user1.login}")
    println("Пароль : ${user1.password}")
    println("адрес электронной почты : ${user1.mail}")
    println()
    println("Данные по пользовтаель №2")
    println("Идентификационный номер : ${user2.id}")
    println("Логин : ${user2.login}")
    println("Пароль : ${user2.password}")
    println("адрес электронной почты : ${user2.mail}")

}

//Класс ЮЗЕР
class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {}