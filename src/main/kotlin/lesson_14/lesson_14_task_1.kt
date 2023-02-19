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
    val ship1 = ClassicShip1("Беда", 50, 25, "Обычный корабль")
    ship1.aboutShip()
    println()
    val iceBreaker1 = ClassicShip1("Sub-Zero", 25, 10, "Ледокол")
    iceBreaker1.aboutShip()
    println()
    val cargoShip1 = ClassicShip1("Верзила", 15, 45, "Грузовой корабль")
    cargoShip1.aboutShip()

}

open class ClassicShip1(
    val name: String,   //название
    val speed: Int,     // скорость
    val capacity: Int, //Вместимость
    val propertyShip: String, //Свойство корабля
){
    fun aboutShip(){
        println("Название: $name")
        println("Скорость: $speed км/ч")
        println("Вместимость: $capacity м.куб")
        println("Тип: $propertyShip")
    }
}

