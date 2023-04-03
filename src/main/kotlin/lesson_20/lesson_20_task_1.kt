package lesson_20

//Задача 1 к Уроку 20
//
//В приложении есть SplashScreen, который приветствует пользователя, обращаясь по имени.
// Напиши лямбда-функцию, которая будет создавать строку с текстом «С наступающим Новым Годом, username!»,
// где username – это имя пользователя. Выведи строку в консоль.
fun main() {

    println("Введите своё имя")

    val splashScreen: (String?)-> String = { userName: String? ->
        "С наступающим Новым Годом, $userName!"
    }
    println(splashScreen(readlnOrNull()))

}