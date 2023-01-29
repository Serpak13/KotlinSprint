package lesson_11


//Задача 2 к Уроку 11
//
//Возьми класс User из первой задачи. Добавь к классу новое необязательное свойство bio и несколько методов.
// Нам нужно иметь возможность посмотреть информацию о пользователе, заполнить описание профиля, изменить пароль и отправить письмо на почту.
//
// – 1 метод должен выводить информацию о пользователе в консоль;
// – 2 метод должен считывать с консоли информацию о себе и сохранять в поле bio;
// – 3 метод изменения пароля сначала должен запросить текущий пароль, и, если он введен верно, запросить новый, изменить его и сообщить, что пароль изменен;
// – 4 метод будет принимать строку с текстом, который мы хотим “отправить” пользователю – метод должен печатать сообщение в консоль.
//
//Далее создай объект, заполни информацию “о себе” (методом чтения с консоли) и измени пароль.
// Затем, проверь изменения и отправь сообщения на почту (в качестве обращения использовать логин), вызывая соответствующие методы.

fun main() {
    val user1 = User(
        id = 9,
        login = "Tony",
        password = "Jarvis",
        mail = "ironman@shield.com",
        bio = " ",
        message = " "
    )

    val user2 = User(
        id = 20,
        login = "Thor",
        password = "PointBreak",
        mail = "godofasgard@shield.com",
        bio = " ",
        message = " "
    )
    //Пользователь 1
    user1.printUserInfo()
    user1.setUserBio()
    println(user1.bio)
    user1.changeUserPassword()
    println("Ваш пароль: ${user1.password}")
    user1.sendMessageUser()
    println("У вас новое сообщение: ${user1.message}")

    //Пользователь 2
    user2.printUserInfo()
    user2.setUserBio()
    println(user2.bio)
    user2.changeUserPassword()
    println("Ваш пароль: ${user2.password}")
    user2.sendMessageUser()
    println("У вас новое сообщение: ${user2.message}")

}


//Класс ЮЗЕР
class User(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String,
    var message : String, // получаемое сообщение
) {
    fun printUserInfo() {  //Информация о пользователе
        println(id)
        println(login)
        println(password)
        println(mail)
    }

    fun setUserBio() {                       //БИО
        println("Расскажите о себе")
        bio = readLine().toString()

    }

    fun changeUserPassword() {                    //Изменение пароля
        println("Введите текущий папроль, чтобы его изменить")
        val insert = readLine()
        if (insert == password) {
            println("Введите новый пароль")
            password = readLine().toString()
            println("Пароль изменён")
        } else {
            println("Неверный пароль, введите ещё раз")
        }
    }

    fun sendMessageUser() {                            //Отправка сообщения
        println("Введите сообщение, которое хотите отправить на почту")
        message = readLine().toString()
    }
}
