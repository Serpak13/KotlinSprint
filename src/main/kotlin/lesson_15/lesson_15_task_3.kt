package lesson_15


//Задача 3 к Уроку 15
//
//На форуме есть два вида пользователей – обычные пользователи и администраторы.
// Пользователи могут читать форум и писать сообщения. Администраторы могут ещё и удалять сообщения и пользователей.
// Напиши классы пользователей и администраторов, используя абстрактный класс.
// У абстрактного класса должны быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль.
fun main() {

    val user1 = User("Пользователь", "Rocky")
    val admin1 = Admin("Администратор", "Master")
    user1.readMessage()
    user1.writeMessage()
    admin1.readMessage()
    admin1.writeMessage()
    admin1.deleteMessage()
}

abstract class UserForum(
    val typeUser: String,

    ) {
    abstract fun readMessage()
    abstract fun writeMessage()
}

class User(
    typeUser: String,
    val nameUser: String
) : UserForum(typeUser) {
    override fun readMessage() {
        println("$typeUser $nameUser читает сообщение")
    }

    override fun writeMessage() {
        println("$typeUser $nameUser пишет сообщение")
    }

}

class Admin(
    typeUser: String,
    val nameUser: String
) : UserForum(typeUser) {
    override fun readMessage() {
        println("$typeUser $nameUser читает сообщение")
    }

    override fun writeMessage() {
        println("$typeUser $nameUser пишет сообщение")
    }

    fun deleteMessage() {
        println("$typeUser $nameUser удалил сообщение")
    }
}