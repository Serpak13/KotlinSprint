package lesson_13


//Задача 1 к Уроку 13
//
//Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и поле company.
// Номер телефона – целочисленное значение. Нужно учесть ситуацию, что поле с компанией может оставаться незаполненным.
// Поля не должны иметь никакой инициализации по умолчанию.
fun main() {
    //Создал один экземпляр класса для примера
    val directoryData = PhoneDirectory("Alex", 911, "")
    println(directoryData._nameCompany?.length)
}

class PhoneDirectory(var nameContacts: String, var _telephoneNumber: Int, var _nameCompany: String?) {

}