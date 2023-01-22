package lesson_10

//Задача 1 к Уроку 10
//
//Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
// Побеждает выбросивший наибольшее число.
//
// – поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
// – бросок костей вынеси в отдельную функцию, в которой генерируются 2 случайных числа от 1 до 6;
// – в отдельные переменные сохрани результат работы функции для игрока и компьютера;
// – после сравнения результатов, выведи соответствующее сообщение в консоль. Например:
// "Победило человечество" или "Победила машина".
fun main() {
    println("Кости бросил игрок")
    val humanTurn = diceTurn()
    println("Кости бросил компьютер")
    val machineTurn = diceTurn()

    if (humanTurn!! > machineTurn!!) {
        println("Человечество победило")
    } else {
        println("Победила машина")
    }
}

// Функция: Бросок костей
fun diceTurn(): Int? {
    val randDice1 = (1..6).random() //Первая кость
    val randDice2 = (1..6).random() //Вторая кость
    val diceSum = randDice1 + randDice2
    println("Результат броска: $diceSum")
    return diceSum
}


