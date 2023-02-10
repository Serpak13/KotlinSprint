package lesson_13

//Задача 2 к Уроку 13
//
//Используй класс из первой задачи. На его основе создай 2 экземпляра.
// В одном из контактов вместо номера и компании пропиши null.
//
//Дополни класс методом, который будет печатать информацию о контакте сообщением такого типа:
//Имя: Ростислав
//Номер: 89123456789
//Компания: Reddit
//
//В одном println() и без использования многострочного ввода. Вместо null значения, в консоль должна выводиться строка [не указано].
fun main() {

    val contact1 = PhoneDirectory("Ростислав", 89123456789, "Reddit")
    val contact2 = PhoneDirectory("Павел", 89996541234, null)

    contact1.printCompanyInformation()
    println()
    contact2.printCompanyInformation()

}
class PhoneDirectory(var nameContacts: String, var telephoneNumber: Long, var nameCompany: String?) {

    fun printCompanyInformation(){
        println("Имя: $nameContacts\nНомер: $telephoneNumber\nКомпания: ${nameCompany ?: "Не указано"}")
    }

}