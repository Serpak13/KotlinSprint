package lesson_2

//Задача 3 к Уроку 2
//
//Сайт с расписанием поездов получает данные с сервера. Сервер посылает
// время выезда и время в пути, а время прибытия вычисляется из них.
// Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
// – Создай целочисленные переменные и проинициализируй их этими данными;
// – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
// – Выведи результат в консоль.
fun main() {
    //println(457 % 60) проверка на остаток минут, получаем 37; Итого 7 часов 37 минут

    // Вводные данные
    val departHour = 9 // часов
    val departMinutes = 39 // минут
    val wayTimeHour = 7 // часов
    val wayTimeMinutes = 37 // минут

    // Расчёт

   // println(76 % 60) проверка остатка минут
    val arrivalMinutes = (departMinutes + wayTimeMinutes) % 60 // вычисляю остаток минут, т.к. в сумме выходит больше часа
    val counterHour = ((departMinutes + wayTimeMinutes) - arrivalMinutes) / 60 //из 76 минут вычленяем 60 минут, которые череводим в часы
    val arrivalHour = departHour + wayTimeHour + counterHour // вычисляем часы


    println("Время отправления поезда - $departHour:$departMinutes")
    println("Время в пути - $wayTimeHour часов $wayTimeMinutes минут")
    println("Время прибытия - $arrivalHour:$arrivalMinutes")

}