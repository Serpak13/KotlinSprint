package lesson_20

//Задача 5 к Уроку 20
//
//Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
// Модификатор устанавливается функцией setModifier(), принимающий лямбду.
//
//Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
// Реализуй модификатор, инвертирующий слова робота.
fun main() {



    val robot = Robot(listOf<String>(
        "Привет", "Меня зовут робот Борис", "Я - передовая отечественная разработка",
        "Но на самом деле", "Я - человек, одетый в костюм работа", "ХА-ХА-ХА", "Как мы всех заскамили?"
    ))

    robot.say()  // Проверка стандартного метода

    val lambdaForSetModifier: (Robot)-> String = {
        robot.phrases.random().reversed()
    }

    fun setModifire(lambdaForSetModifier: (Robot) -> (Robot) -> String){
        println(lambdaForSetModifier)
    }

}

class Robot (val phrases:List<String>) {
    fun say(){
        println(phrases.random())
    }
}

