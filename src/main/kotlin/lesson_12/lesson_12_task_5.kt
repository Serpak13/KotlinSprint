package lesson_12


import kotlin.random.Random
//Задача 5 к Уроку 12
//
//Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и давления,
// и считать количество дождливых дней. Представь, что данные ты получаешь от датчиков и сымитируй их поведение с помощью random.
//
// – в функции main() создай список и добавь в него с помощью цикла 10 объектов класса, передав в конструкторы случайные значения;
// – для расчета среднего значения температуры создай переменные;
// – пройдись циклом по элементам созданного списка и вычисли средние значения температур, а также количество дождливых дней
// –  выведи результаты в консоль. На выходе должны получиться средние значения по температуре днем, ночью и по среднему атмосферному давлению.
fun main() {
    val weatherList: MutableList<WeatherDay> = mutableListOf()

    for (i in 1..10) {
        val weatherDayData = WeatherDay(
            ((-5..20).random() + Random.nextFloat()),
            ((-5..20).random() + Random.nextFloat()),
            Random.nextBoolean(),
            (747..755).random(), (756..765).random()
        )
        weatherList += weatherDayData
    }
    println(weatherList)  //Проверка, верно ли сработал цикл
    var counter1 = 1
   for(i in weatherList){  //цикл для вычисления средней температуры
       val dataTempDay = i.tempDay
       val dataTempNight = i.tempNight
       val averageValueTemperature = ((dataTempDay + dataTempNight) / 2)
       println("Средняя дневная температура дня №$counter1: $averageValueTemperature цельсия")
       counter1 += 1
   }
    var counter2 = 1
    for(i in weatherList){      //цикл для вычисления среднего атмосферного давления
        val dataAtmosphereDay = i.atmospherePressureDay
        val dataAtmosphereNight = i.atmospherePressureNight
        val averageValueAtmosphere = ((dataAtmosphereDay + dataAtmosphereNight) / 2)
        println("Среднее атмосферное давление дня №$counter2: $averageValueAtmosphere мм.рт.ст")
        counter2 += 1
    }

    var rainDay = 0
    for(i in weatherList){  //Подсчёт дождливых дней
        if(i.isRaining){
            rainDay += 1
        }
    }
    println("Количество дождливых дней: $rainDay")
}

data class WeatherDay(
    var tempDay: Float,
    var tempNight: Float,
    var isRaining: Boolean,
    var atmospherePressureDay: Int,
    var atmospherePressureNight: Int,
) {


}