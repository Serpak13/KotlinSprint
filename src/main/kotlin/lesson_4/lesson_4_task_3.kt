package lesson_4

fun main() {
    val weatherToday = "солнечная погода"
    val tentStatus = "тент раскрыт"
    val humidityToday = 20 //влажность
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == WEATHER) && (tentStatus == TENT_STATUS) && (humidityToday == HUMIDITY_BEANS) && (season == SEASON_BEANS)} ")
    // проверка для себя
    //println("${weatherToday == WEATHER}") //true
    //println("${tentStatus == TENT_STATUS}") // true
    //println("${humidityToday == HUMIDITY_BEANS}")  //true
    //println("${season == SEASON_BEANS}") //false
}

const val WEATHER = "солнечная погода"
const val TENT_STATUS = "тент раскрыт"
const val HUMIDITY_BEANS = 20
const val SEASON_BEANS = "не зима"