package lesson_4


fun main() {
    val dayOfHands = 1
    val dayOfLegs = 3
    val dayOfBack = 5
    val dayOfAbs = 7
    val trainingDay = 2

    println(
        """
        |Упражнение для рук:${dayOfHands == trainingDay}
        |Упражнение для ног:${dayOfLegs == trainingDay}
        |Упражнения для спины:${dayOfBack == trainingDay}
        |Упражнения для пресса:${dayOfAbs == trainingDay}
        """.trimIndent()
    )

}