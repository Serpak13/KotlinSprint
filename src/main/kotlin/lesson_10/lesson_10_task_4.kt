package lesson_10

//Задача 4 к Уроку 10
//
//Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
// Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
// В конце программа должна вывести сколько партий он выиграл.
//
// – логика бросков должна быть реализована по примеру из задачи 1;
// – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
// – программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества выйгрышных партий человека;
// – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков).
fun main() {
    var counter = 0 // подсчёт побед человека
    do {
        println("Кости бросил игрок")
        val humanTurn = diceTurn()
        println("Кости бросил компьютер")
        val machineTurn = diceTurn()
        roundNum(human = humanTurn, machine = machineTurn)
        if(humanTurn > machineTurn){
            counter++
        }
        println("Хотите сыграть ещё раз. Введите ДА или НЕТ")
        val userInput = readLine()
        /*if(userInput == "нет"){
            println("Количество партий, выигранных человеком: $counter")
        }*/
    } while (userInput == "да")
    println("Количество партий, выигранных человеком: $counter")

}
// Функция: Бросок костей (Генерация значений брошенных кубиков)
fun diceTurn(): Int {
    val randDice1 = (1..6).random() //Первая кость
    val randDice2 = (1..6).random() //Вторая кость
    val diceSum = randDice1 + randDice2
    println("Результат броска: $diceSum")
    return diceSum
}

//Функция для проведения раундов
fun roundNum(human: Int, machine: Int): String.Companion {

    if (human > machine) {
        println("Человечество победило")
    } else {
        println("Победила машина")
    }
    return String
}
/* var counter = 0 //Счётчик победы человека
 do {
     if (human > machine) {
         println("Человечество победило")
         counter++
     } else {
         println("Победила машина")
     }
     println("Хотите бросить кости ещё раз? Введите да или нет")
     val tryAgain: String = readLine()!!
 } while (tryAgain == "да")
 println("Количество партий, выигранных человеком: $counter")
 return Boolean */
