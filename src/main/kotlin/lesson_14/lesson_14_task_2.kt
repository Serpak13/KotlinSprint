package lesson_14
//Задача 2 к Уроку 14
//
//Преобразуй класс из прошлой задачи в родительский и напиши два подкласса, представляющие грузовой корабль и ледокол.
// Создай по одному экземпляру каждого класса и вызови их методы.
// Придумай для каждого подкласса по 1-2 специализированного свойства.
//
// – добавь метод для ледокола, что он может колоть лед;
// – выведи в консоль информацию с названием кораблей, с какой скоростью движутся,
// сколько перевозят грузов, и что ледокол колет лед.
fun main() {
    val ship1 = ClassicShip("Беда", 50, 25)
    ship1.aboutShip()
    println()
    val iceBreaker1 = IceBreaker("Sub-Zero", 25, 10, "Ледокол")
    iceBreaker1.InformAboutIceBreaker()
    iceBreaker1.actionIceBreaker()
    println()
    val cargoShip1 = CargoShip("Лютый", 30, 50, 15000)
    cargoShip1.tonnageInform()
}

open class ClassicShip(
    val name: String,   //название
    val speed: Int,     // скорость
    val capacity: Int, //Вместимость
){
    fun aboutShip(){
        println("Название: $name")
        println("Тип: Обычный корабль")
        println("Скорость: $speed км/ч")
        println("Вместимость: $capacity м.куб")
    }
}

class IceBreaker(       //Ледокол
    name: String,
    speed: Int,
    capacity: Int,  // Вместимость
    val specialAbilities: String,  //Спец Способность (колоть лёд)
):ClassicShip(name, speed, capacity) {
    fun InformAboutIceBreaker(){
        println("Название: $name")
        println("Скорость: $speed км/ч")
        println("Вместимость: $capacity м.куб")
        println("Тип корабля: $specialAbilities")
    }

    fun actionIceBreaker(){
        println("$name колит лёд")
    }
}

class CargoShip(          //Грузовой корабль
    name: String,
    speed: Int,
    capacity: Int,
    val tonnage: Int,  //Грузоподъёмность (не путать с вместимостью)
):ClassicShip(name, speed, capacity){

    fun tonnageInform(){
        println("Название: $name")
        println("Скорость: $speed км/ч")
        println("Вместимость: $capacity м.куб")
        println("Грузоподъёмность корабля: $tonnage кг.")
    }
}