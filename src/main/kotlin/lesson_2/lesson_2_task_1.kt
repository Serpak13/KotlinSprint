package lesson_2

fun main() {
    val manOne: Float = 3f
    val manTwo: Float = 4f
    val manThree: Float = 3f
    val manFour: Float = 5f

    //Определяем среднее арифметическое как число, равное сумме всех чисел множества, делённой на их количество.
    val arithmeticMean = ((manOne + manTwo + manThree + manFour) / 4)

    println(arithmeticMean)

}