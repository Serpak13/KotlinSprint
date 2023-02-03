package lesson_12

//Измени класс из прошлого задания.
// Используй первичный конструктор, затем так же создай 3 объекта и выведи информацию о них.
// Поля должны быть объявлены и проинициализированы в теле класса.

fun main() {

    val mondayWeather = Weather("+15", "-2", "Идёт дождь")
    println("Погода в понедельник")
    mondayWeather.dataWeather()
    println()
    val sundayWeather = Weather("+20", "+10", "Дождя нет")
    println("Погода в воскресенье")
    sundayWeather.dataWeather()
}

class Weather(_tempDay: String, _tempNight: String, _isRaining: String) {
    var tempDay = _tempDay
    var tempNight = _tempNight
    var isRaining = _isRaining

    fun dataWeather() {
        println("Погода днём $tempDay градусов по цельсию")
        println("Погода ночью $tempNight градусов по цельсию")
        println("Осадки: $isRaining")
    }

}