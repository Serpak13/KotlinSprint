package lesson_2

fun main() {
    //Вводные данные
    val crystal = 7
    val iron = 11
    val baff = 20 // 20%

    //Расчёт

    val crystalBaff = (crystal * baff) / 100
    val ironBaff = (iron * baff) / 100

    println("Количество бонусной кристаллической руды - $crystalBaff шт.")
    println("Количество бонусной железной руды - $ironBaff шт.")


}