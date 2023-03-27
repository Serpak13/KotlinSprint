package lesson_18

//Задача 3 к Уроку 18
//
//В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть.
// Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
// Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.
//
//Напиши эти классы, используя полиморфизм и создай по одному экземпляру.
fun main() {

    val fox: Animal = Fox("Ягоды")
    val dog: Animal = Dog("Кости")
    val cat: Animal = Cat("Рыба")
    fox.action()
    dog.action()
    cat.action()
}

abstract class Animal(val name: String) {
    abstract fun action()
}

class Fox(
    private val food: String,
): Animal("Лиса") {
    override fun action() {
        println("$name - ест $food")
    }
}

class Dog(
    private val food: String,
): Animal("Собака") {
    override fun action() {
        println("$name - ест $food")
    }
}

class Cat(
    private val food: String,
): Animal("Кошка") {
    override fun action() {
        println("$name - ест $food")
    }
}