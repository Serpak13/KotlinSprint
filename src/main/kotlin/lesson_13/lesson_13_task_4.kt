package lesson_13


//Задача 4 к Уроку 13
//
//Допиши функцию, для программы, которая позволит пользователю добавлять записи в телефонную книгу.
// Функция должна валидировать следующие случаи: пользователь ввел имя и номер, пользователь не ввел имя или компанию
// (вместо пустой строки должен быть null), пользователь не ввел номер телефона (такая запись не должна добавляться).
//
//После добавления первой записи, пользователя спрашивают “Если хотите добавить новую запись, введите \“да\””.
// В любом другом случае функция завершает работу. Программа должна добавлять столько записей, сколько пользователю нужно,
// а затем печатать все записи в консоли в компактном виде.
fun main() {

    /* val contact1 = PhoneDirectory("Ростислав", null, "Reddit")
    val contact2 = PhoneDirectory("Павел", "89996541234", null)
    val contact3 = PhoneDirectory(null, "83825648912", "Rockstar")
    val contacts: List<PhoneDirectory> = listOf(contact1, contact2, contact3) //список контактов */

    addingInformationToDirectory()
}

fun addingInformationToDirectory() {
    var contactsListNew: List<PhoneDirectoryNew> = mutableListOf()
    do {
        println("Введите имя контакта")
        val newName = readlnOrNull() ?: "Не указано"
        println("Введите номер телефона")
        val newTelephoneNumber = readlnOrNull() ?: return
        println("Введите название компании")
        val newCompanyName = readlnOrNull() ?: "Не указано"
        val newContacts = PhoneDirectoryNew(nameContacts =  newName, telephoneNumber = newTelephoneNumber, nameCompany = newCompanyName)
        contactsListNew += newContacts
        println("Хотите добавить ещё один контакт? Введите \"да\" или \"нет\"")
        val answerUser = readLine()!!
    } while (answerUser == "да")
    println(contactsListNew)

}
data class PhoneDirectoryNew(var nameContacts: String?, var telephoneNumber: String?, var nameCompany: String?) {
}

/*fun printCompanyInformation(contactsAll: List<PhoneDirectoryNew>) {
    val value1 = contactsAll[0]
    val value2 = contactsAll[1]
    val value3 = contactsAll[2]
    println("Имя: ${value1.nameContacts ?: "Не указано"}\nНомер: ${value1.telephoneNumber ?: "Не указано"}\nКомпания: ${value1.nameCompany ?: "Не указано"}")
    println()
    println("Имя: ${value2.nameContacts ?: "Не указано"}\nНомер: ${value2.telephoneNumber ?: "Не указано"}\nКомпания: ${value2.nameCompany ?: "Не указано"}")
    println()
    println("Имя: ${value3.nameContacts ?: "Не указано"}\nНомер: ${value3.telephoneNumber ?: "Не указано"}\nКомпания: ${value3.nameCompany ?: "Не указано"}")
}*/

