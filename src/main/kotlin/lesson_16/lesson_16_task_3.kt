package lesson_16

//Задача 3 к Уроку 16
//
//Создай класс, описывающий пользователя. У него должен быть логин и пароль.
// Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
// Выведи информацию о релевантности пароля в консоль.
fun main() {

    val user1 = User("Johny", "qwerty")
    user1.checkPassword()

}

class User(val loginUser: String, private val passwordUser: String){



    fun checkPassword(){
        println("Введите пароль")
        if(readLine() == passwordUser) println("Пароль введён верно")
        else println("Пароль введён неверно")
    }
}