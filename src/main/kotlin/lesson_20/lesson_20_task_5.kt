package lesson_20

//Задача 5 к Уроку 20
//
//Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
// Модификатор устанавливается функцией setModifier(), принимающий лямбду.
//
//Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
// Реализуй модификатор, инвертирующий слова робота.
fun main() {

    val robot = Robot(
        listOf<String>(
            "Привет", "Меня зовут робот Борис", "Я - передовая отечественная разработка",
            "Но на самом деле", "Я - человек, одетый в костюм работа", "ХА-ХА-ХА", "Как мы всех заскамили?"
        )
    )

    robot.say()  // Проверка стандартного метода
    robot.setModifire()
    robot.say()


}

class Robot(private var phrases: List<String>) {

    private val lambdaSay = { println(phrases.random()) }


    fun setModifire() {
        phrases = phrases.map { it.toList().reversed().joinToString("").toString() }
    }

    fun say() {
        lambdaSay.invoke()
    }
}

