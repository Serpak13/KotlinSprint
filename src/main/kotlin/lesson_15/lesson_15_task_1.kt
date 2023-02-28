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
    crucian1.flyMethod()
    gull1.flyMethod()
    gull1.movementMethodWater()
    duck1.flyMethod()
    duck1.movementMethodWater()


}

abstract class Animal: MovementableWater, Flyable{
    abstract  val name: String //Название животного
}

class Fish(
    override val name: String
): Animal() {

    override fun movementMethodWater() {
        println("$name передвигается в воде за счёт плавников и хваста")
    }

    override fun flyMethod() {
        println("$name не летает")
    }
}

class Bird(
    override val name: String
): Animal(){
    override fun movementMethodWater() {
        println("Туловище $name немного сплюснуто. За счет этого птица способна удерживаться на плаву. Также птица отличается тем, что её кости – полые, легкие.")
    }

    override fun flyMethod() {
        println("$name передвигается по воздуху за счёт крыльев")
    }
}

interface MovementableWater {
    fun movementMethodWater()
}

interface Flyable{
    fun flyMethod()
}