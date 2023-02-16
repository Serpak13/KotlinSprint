package lesson_14


//Задача 1 к Уроку 14
//
//В компьютерной игре есть три типа кораблей: стандартные, грузовые и ледоколы.
// У всех кораблей свои параметры: название, скорость и т. д.
// У грузовых скорость меньше, а грузоподъемность больше.
// У ледоколов ниже и скорость и вместительность, но они могут колоть лёд.
//
// – создай класс, стандартный корабль;
// – затем создай экземпляр этого класса и вызови его методы:
// с какой скоростью движется, сколько перевозит ящиков груза;
// – выведи информацию о свойствах кораблей в консоль.
fun main() {
    val ship1 = ClassicShip("Беда", 50, 25)
    ship1.aboutShip()
    println()
    val iceBreaker1 = IceBreaker("Sub-Zero", 25, 10, "Ледокол")
    iceBreaker1.InformAboutIceBreaker()
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