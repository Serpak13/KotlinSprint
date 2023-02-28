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
    crucian1.movementMethod()
    gull1.movementMethod()
    duck1.movementMethod()


}

abstract class Animal: Movementable{
    abstract  val name: String //Название животного
}

class Fish(
    override val name: String
): Animal() {

    override fun movementMethod() {
        println("$name передвигается в воде за счёт плавников и хваста")
    }
}

class Bird(
    override val name: String
): Animal(){
    override fun movementMethod() {
        println("$name передвигается по воздуху за счёт крыльев, по земле на лапах и сплавляетя по воде")
    }
}

interface Movementable {
    fun movementMethod()
}
