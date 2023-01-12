package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val secondTimer = readLine()!!.toInt()
    var counter = secondTimer
    while(counter > 0){
        println("${counter--}")
        Thread.sleep(1000)
    }
    println("Прошло $secondTimer секунд")
}
