package lesson_11


//Задача 5 к Уроку 11
//
//Реализовать класс работы форума (Forum), использующий созданные классы пользователей из 1 и 2 задачи.
//
//Примени паттерн “Фабрика”:
//
// – напрямую объекты не создаются. Пользователи добавляются на форум методом newUser() класса Forum;
// – сообщения добавляются на форум методом newMessage(authorId: Int, ...) класса Forum;
// – id-шники новых объектов, а также подстановка авторов для сообщений реализована внутри класса Forum;
// – у класса Forum реализуй метод printThread(), печатающий в консоль последовательно сообщения добавленные ранее в формате:
//автор: сообщение
//автор: сообщение
//
//В функции main() создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого пользователя.

fun main() {
 val forum = Forum()
 val arthur = forum.newUser("Arthur", "pass1", "arthur.dent@mail.ru")
 val marvin = forum.newUser("Marvin", "pass2", "marvin@mail.ru")

 forum.newMessage(arthur.id, "Hello, Marv!")
 forum.newMessage(marvin.id, "Hi, Arthur!")
 forum.newMessage(arthur.id, "It is ok?")
 forum.newMessage(marvin.id, "Don't panic")

 forum.printThread()
}

class User(
 val id: Int,
 val userName: String,
 val password: String,
 val email: String,
)

class Message(
 val id: Int,
 val author: User,
 val text: String,
)

class Forum(
 private var messageIdCounter: Int = 0,
 private var userIdCounter: Int = 0,
 private val authors: MutableList<User> = mutableListOf(),
 private val messages: MutableList<Message> = mutableListOf(),
) {
 fun newUser(username: String, password: String, email: String): User {
  val user = User(
   id = userIdCounter,
   userName = username,
   password = password,
   email = email,
  )
  authors.add(user)
  userIdCounter++
  return user
 }

 fun newMessage(authorId: Int, text: String) {
  val user = authors.find { it.id == authorId }
   ?: throw IllegalStateException("Author with id ${authorId} not found on forum")
  val message = Message(id = messageIdCounter, author = user, text = text)
  messages.add(message)
  messageIdCounter++
 }

 fun printThread() {
  messages.forEach {
   println("${it.author.userName}: ${it.text}")
  }
 }
}

