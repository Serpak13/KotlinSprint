package lesson_19


//Задача 3 к Уроку 19
//
//В игре есть космический корабль. Он может взлетать, приземляться и отстреливаться от астероида.
//
//Задача описать класс и его методы. Требуемая реализация методов нам пока неизвестна.
// Один из методов должен содержать явную пометку-напоминание о том, что здесь нужна информация о дополнительной логике.
// Другой метод должен вызывать падение программы с ошибкой NotImplementedError.
fun main() {
    val ship1 = SpaceShip("Баракуда", 200, true)
    ship1.actionFlayShip()
    ship1.landingShip()
    ship1.fireWeapon() // NotImplementedError.
}

class SpaceShip(
    val nameShip: String,
    val speedShip: Int,
    val presenceOfWeapons: Boolean,
) {

    fun actionFlayShip() {
        println("Корабль взлетел")
    }

    fun landingShip() {
        //TODO("Необходимо прописать дополнительную логику")
    }

    fun fireWeapon() {
        TODO()
    }
}