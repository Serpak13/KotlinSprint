package lesson_7
import java.util.concurrent.ThreadLocalRandom

//Задача 2 к Уроку 7
//
//Создай программу, имитирующую авторизацию по коду из смс.
// Программа будет “высылать” код из четырех цифр (случайное число от 1000 до 9999).
// Выведи его в консоль с текстом “Ваш код авторизации: N”.
// Далее программа запрашивает ввод кода, чтобы авторизоваться.
//
//Если код введён неверно – программа вышлет новый (отобразит в консоли) и снова будет запрашивать его ввод для попытки авторизации.
// Если код введен верно – программа отображает приветствие и завершает работу.
fun main() {
    var randomNum = ThreadLocalRandom.current().nextInt(1000, 9999)
    println("Ваш код авторизации: $randomNum")
    println("Введите код для авторизации из смс")
    var userNum = readLine()!!.toInt()

    if(userNum == randomNum){
        println("Авторизация пройдена успешно!")
    }
    else{
        while(userNum != randomNum){
            randomNum = ThreadLocalRandom.current().nextInt(1000, 9999)
            println("Ваш код авторизации: $randomNum")
            println("Введите код для авторизации из смс")
            userNum = readLine()!!.toInt()
        }
        println("Авторизация пройдена успешно!")
    }

}