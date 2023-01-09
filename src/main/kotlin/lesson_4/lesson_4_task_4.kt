package lesson_4


fun main() {
    val dayOfHands = 1
    val dayOfLegs = 3
    val dayOfBack = 7
    val dayOfAbs = 1
    val trainingDay = 5  // какой день тренировки

    println(
        """
        Упражнение для рук:${(dayOfHands == trainingDay) || (trainingDay == 5)}
        Упражнение для ног:${dayOfLegs == trainingDay}
        Упражнения для спины:${dayOfBack == trainingDay}
        Упражнения для пресса:${dayOfAbs == trainingDay || (trainingDay == 5)}
        """.trimIndent()
    )

}

//const val PAIN_GAIN = 1 //нечётный день
//const val RELAX = 0 //чётный день