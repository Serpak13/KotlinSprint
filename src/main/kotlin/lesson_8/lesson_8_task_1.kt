package lesson_8


//Задача 1 к Уроку 8
//
//Скрипт считает количество просмотров рекламы за день. Напиши программу,
// которая сохраняет в массив данные просмотров
// за неделю (числа использовать на свое усмотрение). Каждая ячейка хранит количество просмотров за день.
// Имея массив с данными, нужно посчитать сколько всего было просмотров за неделю. Результат вычислений выведи в консоль.
fun main() {

    val viewingAds:IntArray = intArrayOf(7,15,17,2,28,19,31)

    println("Количество просмотров рекламы за неделю: ${viewingAds.sum()}")
}