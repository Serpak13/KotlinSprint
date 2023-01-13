package lesson_6
import java.util.concurrent.ThreadLocalRandom


//Задача 5 к Уроку 6
//
//Доработка задачи на авторизацию.
// Нужно написать часть модуля для авторизации пользователя.
// Для входа в приложение пользователь должен доказать, что он не бот.
// Для этого программа предлагает решить простой математический пример – сложить два числа.
// Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
//
//При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
// Дай пользователю три попытки пройти тест. Для этого придется каждый раз генерировать новый математический пример и
// предлагать решить его заново.
//
//Для простоты ограничься примерами на сложение с использованием цифр от 1 до 9.
// Если три попытки оказались неудачными, вывести сообщение "Доступ запрещен".
fun main() {
    //Вводные данные
    var randomNumOne = ThreadLocalRandom.current().nextInt(1, 9)
    var randomNumTwo = ThreadLocalRandom.current().nextInt(1, 9)
    var randomSum = randomNumOne + randomNumTwo

    println("Докажите что вы не бот, решите простой математический пример.\nСколько будет $randomNumOne + $randomNumTwo ?")

    var counter = 1  //Счётчик попыток, первая пошла
    var userNum = readLine()!!.toInt()
    if(userNum == randomSum){
        println("Добро пожаловать!")
    }
    else {
        counter = 2 // Вторая попытка пошла
        while (userNum != randomSum && counter <= 3) {
            randomNumOne = ThreadLocalRandom.current().nextInt(1, 9)
            randomNumTwo = ThreadLocalRandom.current().nextInt(1, 9)
            randomSum = randomNumOne + randomNumTwo
            counter +=1
            println("Сколько будет $randomNumOne + $randomNumTwo ?")
            userNum = readLine()!!.toInt()
            if(counter <= 3 && userNum != randomSum){
                println("Доступ запрещён")
            }
            else if(userNum == randomSum && counter <= 3){
                println("Добро пожаловать!")
            }
        }

    }

}
