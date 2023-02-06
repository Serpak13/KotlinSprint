package lesson_12

//Задача 3 к Уроку 12
//
//Усовершенствуй класс Day. Перепиши его, используя сокращенную запись (без полей внутри тела класса).
// Переменной, хранящей информацию о дожде, установи значение по умолчанию.
// Информацию о погоде по дням выведи в консоль отдельным методом класса.
fun main() {

    val monday = WeatherDayInform("Понедельник", 4.0, 15.0)
    val tuesday = WeatherDayInform("Вторник", -1.0, 5.0, true)
    monday.dataWeatherPrint()
    println()
    tuesday.dataWeatherPrint()
}

class WeatherDayInform(
    var dayOfTheWeek: String,
    var tempDay: Double,
    var tempNight: Double,
    var isRaining: Boolean = false
) {
    fun dataWeatherPrint() {
        println("Сегодня: $dayOfTheWeek")
        println("Погода днём $tempDay градусов по цельсию")
        println("Погода ночью $tempNight градусов по цельсию")
        println("Идёт ли дождь: $isRaining")
    }

}