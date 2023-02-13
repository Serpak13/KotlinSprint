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

    addingInformationToDirectory()
}

fun addingInformationToDirectory() {
    val contactsListNew: MutableList<PhoneDirectoryNew> = mutableListOf()
    do {
        println("Введите имя контакта")
        val newName = readLine()?.takeIf { it.isNotEmpty() } ?: "Не указано"
        println("Введите номер телефона")
        val newTelephoneNumber = readLine()?.takeIf { it.isNotEmpty() } ?: "Не указано"
        println("Введите название компании")
        val newCompanyName = readLine()?.takeIf { it.isNotEmpty() } ?: "Не указано"
        val newContact = PhoneDirectoryNew(nameContact =  newName, telephoneNumber = newTelephoneNumber, nameCompany = newCompanyName)
        contactsListNew.add(newContact)
        println("Хотите добавить ещё один контакт? Введите \"да\" или \"нет\"")
        val answerUser = readLine()!!
    } while (answerUser == "да")

    for(i in contactsListNew){
        println("Имя контакта: ${i.nameContact}")
        println("Номер телефона: ${i.telephoneNumber}")
        println("Название компании: ${i.nameCompany}")
        println()
    }
}
data class PhoneDirectoryNew(var nameContact: String?, var telephoneNumber: String?, var nameCompany: String?) {
}



