package lesson_4

fun main() {
    val resToday = 13 //резерв сегодня
    // так как известно что 4 стола свободны , значит 9 зарезервировано
    val resTomorrow = 9 // резерв завтра
    val resultToday = (resToday < TABLES)
    val resultTomorrow = (resTomorrow < TABLES)

    println("Доступность столиков на сегодня: $resultToday,\nДоступность столиков на завтра: $resultTomorrow")
}

const val TABLES = 13