package lesson_3

fun main() {
    val num = readLine()!!.toInt()

    for (i in 1..10) {
        val result = num * i
        println("$num * $i = $result")
    }
}