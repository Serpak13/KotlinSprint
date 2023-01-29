package lesson_11

//Задача 3 к Уроку 11
//
//Нужно описать сущности для упрощенной версии приложения социальной сети, в которой общаются только голосом.
//
//Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
// В карточке “комнаты” отображается:
// – обложка
// – название
// – список участников, которые отображаются в виде аватарок.
// При долгом нажатии на аватар подсветится его никнейм. Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего:
// “разговаривает”, “микрофон выключен”, “пользователь заглушен”.
//
//После проектирования создай список объектов карточек с несколькими “комнатами” с произвольными данными.
fun main() {
    val user1 = Users(
        avatarUser = "Photo1",
        nickName = "Visaraner",
        userStatus = "Разговаривает",
    )

    val user2 = Users(
        avatarUser = "Photo2",
        nickName = "Careerist",
        userStatus = "Микрофон выключен",
    )

    val user3 = Users(
        avatarUser = "Photo3",
        nickName = "Funy",
        userStatus = "Пользователь заглушён",
    )
    val room1 = Rooms(
        cover = "Car",
        title = "Visarun",
        listParticipants = listOf(user1.nickName)
    )

    val room2 = Rooms(
        cover = "Work",
        title = "HeadHunter",
        listParticipants = listOf(user2.nickName)
    )

    val room3 = Rooms(
        cover = "Balloons",
        title = "Hobby",
        listParticipants = listOf(user3.nickName)
    )

    val listRooms = listOf<String>(room1.title, room2.title, room3.title)
    println("Список комнат: $listRooms")
}

class Rooms(   //Комнаты
    val cover: String,  //Обложка
    val title: String,  // Название комнаты
    val listParticipants: List<String>, //Список участников в виде аватарок

)

class Users( //Пользователи
    val avatarUser : String, //Аватар пользователя
    val nickName: String,   // Никнейм пользователя
    val userStatus: String // Статус пользователя
)