package lesson_18

//Задача 3 к Уроку 18
//
//В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть.
// Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
// Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.
//
//Напиши эти классы, используя полиморфизм и создай по одному экземпляру.
fun main() {

    val fox: Animal = Fox()
    val dog: Animal = Dog()
    val cat: Animal = Cat()
    fox.animalPlay()
    fox.animalSleep()
    fox.animalEat()
    println()
    dog.animalPlay()
    dog.animalSleep()
    dog.animalEat()
    println()
    cat.animalPlay()
    cat.animalSleep()
    cat.animalEat()
    println()

}

abstract class Animal() {
    abstract fun animalPlay()
    abstract fun animalSleep()
    abstract fun animalEat()

}

class Fox(
    private val name: String = "Лиса",
): Animal() {
    override fun animalPlay() {
        println("$name играет в салочки")
    }
    override fun animalSleep() {
        println("$name спит в норе")
    }
    override fun animalEat() {
        println("$name есть ягоды")
    }

}

class Dog(
    private val name: String = "Собака",
): Animal() {
    override fun animalPlay() {
        println("$name играет с мячиком")
    }

    override fun animalSleep() {
        println("$name спит в конуре")
    }

    override fun animalEat() {
        println("$name есть кость")
    }

}

class Cat(
    private val name: String = "Кошка",
): Animal() {
    override fun animalPlay() {
        println("$name играет с мышью")
    }

    override fun animalSleep() {
        println("$name спит в домике")
    }

    override fun animalEat() {
        println("$name ест рыбу")
    }

}