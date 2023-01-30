package lesson_11


//Задача 4 к Уроку 11
//
//Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
// Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
// В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
// После проектирования создай объект класса Contact с данными из скриншота.
fun main() {
    val contact1 = Contacts(
        avatar = "mouse",
        nameUser = "First Name Second Name",
        cellNumber = "89999994242",
        homePhoneNumber = "89998884242",
        emailAddress = "mail@mail.ru",
        wifeNumber = "жена",
        friendNumber1 = "подруга",
        friendNumber2 = "подруга",
    )

    contact1.callContact()
    contact1.sendMessage()
    contact1.videoCall()
    contact1.sendEmail()
    contact1.faceTimeCall()
    contact1.faceTimeVideoCall()
}

class Contacts(
    val avatar: String,
    val nameUser :String,
    val cellNumber: String,
    val homePhoneNumber: String,
    val emailAddress: String,
    val wifeNumber: String,
    val friendNumber1: String,
    val friendNumber2: String,
) {
    fun sendMessage(){
        println("Пользователь перешёл на экран отправки СМС")
    }
    fun callContact(){
        println("Совершить зваонок на сотовый или доманий номер ?")
        val inputUser = readLine()
        if (inputUser == "сотовый"){
            println("Вызов 89999994242")
        } else println("Вызов 89998884242")

    }
    fun videoCall(){
        println("Выберите мессенджер для видеовызова : Telegramm или Watsapp ?")
        val changeApp = readLine()
        if(changeApp == "Telegramm"){
            println("Пользователь перешёл в приложение Telegramm для вызова")
        }else println("Пользователь перешёл в приложение Watsapp для вызова")
    }
    fun sendEmail(){
        println("Пользователь перешёл на экран отправки письма по электронной почте")
    }

    fun faceTimeCall(){
        println("Звонок по FaceTime")
    }

    fun faceTimeVideoCall(){
        println("Видеовызов по FaceTime")
    }

}