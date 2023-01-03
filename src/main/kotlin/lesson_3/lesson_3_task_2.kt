package lesson_3


fun main() {
    var surName = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("Фамилия: $surName")
    println("Имя: $name")
    println("Отчество: $patronymic")
    println("Возраст: $age лет")

    surName = "Сидорова"
    age = 22

    println("Фамилия: $surName")
    println("Имя: $name")
    println("Отчество: $patronymic")
    println("Возраст: $age года")
}