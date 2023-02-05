package lesson_12

//Задача 3 к Уроку 12
//
//Усовершенствуй класс Day. Перепиши его, используя сокращенную запись (без полей внутри тела класса).
// Переменной, хранящей информацию о дожде, установи значение по умолчанию.
// Информацию о погоде по дням выведи в консоль отдельным методом класса.
fun main() {

    val monday = WeatherDay("Понедельник", 4.0 , 15.0)
    val tuesday = WeatherDay("Вторник", -1.0, 5.0, "Дождя нет")
    monday.dataWeather()
    println()
    tuesday.dataWeather()
}

class WeatherDay(var dayOfTheWeek: String, var tempDay: Double, var tempNight: Double, var isRaining: String = "Идёт дождь") {
    fun dataWeather() {
        println("Сегодня: $dayOfTheWeek")
        println("Погода днём $tempDay градусов по цельсию")
        println("Погода ночью $tempNight градусов по цельсию")
        println("Осадки: $isRaining")
    }

}