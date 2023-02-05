package lesson_12

//Задача 4 к Уроку 12
//
//Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.

fun main() {

    val monday = WeatherDay("Понедельник", 20.0 , 8.0)
    val tuesday = WeatherDay("Вторник", -1.0, 4.0, "Дождя нет")

}

class WeatherDay(var dayOfTheWeek: String, var tempDay: Double, var tempNight: Double, var isRaining: String = "Идёт дождь") {
    init{
        println("Сегодня: $dayOfTheWeek")
        println("Погода днём $tempDay градусов по цельсию")
        println("Погода ночью $tempNight градусов по цельсию")
        println("Осадки: $isRaining")
        println()

    }

}