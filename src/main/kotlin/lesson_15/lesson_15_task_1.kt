package lesson_15


//Задача 1 к Уроку 15
//
//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//
// – создай интерфейсы с методами передвижения для следующих существ: карась, чайка, утка;
// – затем создай для каждого существа классы, реализующие соответствующие интерфейсы;
// – выведи сообщения в консоль, о том как они могут передвигаться.

fun main() {
    val crucian1 = Fish("Карась")
    val gull1 = Bird("Чайка")
    val duck1 = Bird("Утка")
    crucian1.movementMethodWater()
    gull1.flyMethod()
    gull1.movementMethodWater()
    duck1.flyMethod()
    duck1.movementMethodWater()



}

abstract class Animal{
    abstract  val name: String //Название животного
}

class Fish(
    override val name: String
): Animal(), MovementableWater {

    override fun movementMethodWater() {
        println("$name передвигается в воде за счёт плавников и хвоста")
    }

}

class Bird(
    override val name: String
): Animal(), Flyable, MovementableWater{

    override fun flyMethod() {
        println("$name передвигается по воздуху за счёт крыльев")
    }

    override fun movementMethodWater() {
        println("$name может плавать благодаря малой плотности (оперение, воздушные мешки)")
    }
}

interface MovementableWater {
    fun movementMethodWater()
}

interface Flyable{
    fun flyMethod()
}

