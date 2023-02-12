package lesson_13

//Задача 3 к Уроку 13
//
//Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
//
//Создай пустой список, добавь в него несколько объектов, инициализируя их с разнообразными данными (в том числе и null).
//
//Напиши функцию, которая будет выводить имя, номер телефона и компанию.
// Если какого-либо значения нет – программа должна заменить его на строку [не указано].
// С помощью этой функции выведи в консоль все объекты из списка.
fun main() {

    val contact1 = PhoneDirectory("Ростислав", null, "Reddit")
    val contact2 = PhoneDirectory("Павел", 89996541234, null)
    val contact3 = PhoneDirectory(null, 83825648912, "Rockstar")

    val contacts: List<PhoneDirectory> = listOf(contact1, contact2, contact3) //список контактов

    printCompanyInformation(contacts)
}

fun printCompanyInformation(contactsAll : List<PhoneDirectory>) {
        val value1 = contactsAll[0]
        val value2 = contactsAll[1]
        val value3 = contactsAll[2]
        println("Имя: ${value1.nameContacts ?: "Не указано"}\nНомер: ${value1.telephoneNumber ?: "Не указано"}\nКомпания: ${value1.nameCompany ?: "Не указано"}")
        println()
        println("Имя: ${value2.nameContacts ?: "Не указано"}\nНомер: ${value2.telephoneNumber ?: "Не указано"}\nКомпания: ${value2.nameCompany ?: "Не указано"}")
        println()
        println("Имя: ${value3.nameContacts ?: "Не указано"}\nНомер: ${value3.telephoneNumber ?: "Не указано"}\nКомпания: ${value3.nameCompany ?: "Не указано"}")
}
data class PhoneDirectory(var nameContacts: String?, var telephoneNumber: Long?, var nameCompany: String?) {


}