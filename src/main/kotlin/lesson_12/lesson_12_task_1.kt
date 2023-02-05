package lesson_12

//Задача 1 к Уроку 12
//
//Создай класс для программы, отслеживающей погоду. Объекты класса будут хранить температуру днем и ночью, был ли дождь,
// атмосферное давление. В этом задании нужно использовать пустой конструктор.
//
//Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
// – в классе создай переменные и проинициализируй их какими-нибудь значениями;
// – затем в объектах подставь другие значения этим переменным.

fun main() {

    val mondayWeather = Weather()
    mondayWeather.tempDay = 10.0
    mondayWeather.tempNight = 1.0
    mondayWeather.isRaining = "Дождя нет"
    println("Погода в понедельник")
    mondayWeather.dataWeather()
    println()
    val sundayWeather = Weather()
    sundayWeather.tempDay = 5.0
    sundayWeather.tempNight = -3.0
    sundayWeather.isRaining = "Идёт дождь"
    println("Погода в воскресенье")
    sundayWeather.dataWeather()
}

class Weather {
    var tempDay = 4.0
    var tempNight = -1.0
    var isRaining = "Дождя нет"

    fun dataWeather() {
        println("Погода днём $tempDay градусов по цельсию")
        println("Погода ночью $tempNight градусов по цельсию")
        println("Осадки: $isRaining")
    }

}