package lesson_17

//Задача 2 к Уроку 17
//
//Нужно написать класс для корабля в мобильной игре. У корабля есть имя, средняя скорость и порт приписки.
// Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.
// Создать экземпляр класса и протестировать работу.
fun main() {

    val ship1 = Ship("Беда", 200, "Аликанте")

    println(ship1.name)
    ship1.name = "Каракатица"
    println(ship1.name)

}

class Ship(private val nameShip: String, val averageSpeed: Int, val port: String){
    var name = nameShip
        get() = field
        set(value: String){
            println("Вы не можете изменить имя корабля")
        }

}