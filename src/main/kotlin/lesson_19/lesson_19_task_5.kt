package lesson_19


//Задача 5 к Уроку 19
//
//Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.
//
//Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится в консоль.
//
//При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны).
fun main() {

    val listPeople: MutableList<Human> = mutableListOf<Human>()

    for (i in 1..5) {
        println("Введите имя")
        val inputName: String? = readlnOrNull()
        println("Введите пол \"М\" или \"Ж\"")
        val inputGender = when (readLine()) {
            "М" -> Gender.MAN
            "Ж" -> Gender.FEMALE
            else -> Gender.ERROR
        }
        listPeople.add(Human(name = inputName, gender = inputGender))
    }
    println(listPeople)

}

enum class Gender(nameGender: String) {
    MAN("мужской"),
    FEMALE("женский"),
    ERROR("Ошибка ввода данных");
}

data class Human(val name: String?, val gender: Gender)

