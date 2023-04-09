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
            "Привет, я робот", "Меня зовут Арчи", "Я - передовая разработка",
            "У меня имеется модификатор речи", "Который позваляет говорит слова задом наперёд"
        )
    )


    robot.say()  // Проверка стандартного метода
    robot.setModifier { phrase:String ->
        phrase.reversed()
    }
    robot.say()


}

class Robot(private var phrases: List<String>) {

    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val randomString = phrases.random()
        println(modifier(randomString))
    }

}



