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
            "Привет", "Я - робот", "Я - передовая разработка",
            "Могу использовать модификатор речи", "Дя того чтобы говорить слова задом наперёд"
        )
    )

    val lambdaRevers:(List<String>)-> String = {phrasesList: List<String> ->
        robot.phrases.random().reversed()
    }  //делаем реверс

    robot.say()  // Проверка стандартного метода
    robot.setModifire(lambdaRevers)
    robot.say()
}



class Robot(var phrases: List<String>) {



    fun setModifire(revers:(List<String>)->String) {

    }
    fun say() {
        println(phrases.random())
    }
}

