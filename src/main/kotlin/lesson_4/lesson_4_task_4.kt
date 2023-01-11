package lesson_4


fun main() {
    val numberOfDay = 5
    val isEven = (numberOfDay % 2 == 0)
    val arms = !isEven
    val legs = isEven
    val back = isEven
    val abs = !isEven


    println(
        """
        |Упражнение для рук:$arms
        |Упражнение для ног:$legs
        |Упражнения для спины:$back
        |Упражнения для пресса:$abs
        """.trimIndent()
    )

}

