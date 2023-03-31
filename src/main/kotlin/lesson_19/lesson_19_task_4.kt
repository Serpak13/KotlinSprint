package lesson_19


//Задача 4 к Уроку 19
//
//В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара. Синие – 5 единиц, зеленые – 10, красные – 20.
//
// – создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
// При выстреле в консоль должен выводиться нанесенный урон;
// – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
// – в решении должен использоваться enum.
fun main() {

    val tank1 = Tank(Bullet.RED)

    println(tank1.fireTank())
    tank1.exChangeBulletType(Bullet.BLUE)
    println(tank1.fireTank())
    tank1.exChangeBulletType(Bullet.GREEN)
    println(tank1.fireTank())

}

enum class Bullet(
    val damage: Int,
) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var bulletType: Bullet = Bullet.RED) {
    fun fireTank(): String {
        return "Произведён выстрел! Нанесённый урон ${bulletType.damage}"
    }

    fun exChangeBulletType(type: Bullet) {
        bulletType = type
        println("Патроны поменяны на $type")
    }

}