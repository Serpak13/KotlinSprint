package lesson_15


//Задача 5 к Уроку 15
//
//В компьютерной игре есть грузовые и легковые автомобили. Напиши интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
// Грузовые машины могут перевозить одного пассажира и 2 тонны груза, легковые – трех пассажиров.
// Сообщения о действиях выведи в консоль. Создай классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.
fun main() {

    val passengerCar1 = PassengerCar("Легковой автомобиль №1", 3)
    val passengerCar2 = PassengerCar("Легковой автомобиль №2", 2)
    val truck1 = Truck("Грузовик №1", 1, 2)
    //НАЧАЛО ДВИЖЕНИЕ
    passengerCar1.moveAuto()
    passengerCar2.moveAuto()
    truck1.moveAuto()
    println()
    //ПЕРЕВОЗКА ГРУЗА

    // ФУНКЦИИ ДЛЯ ПОДСЧЁТА ОБЩЕГО ЧИСЛА ЛЮДЕЙ И ГРУЗА
    val listAuto: List<Auto> = mutableListOf<Auto>(passengerCar1, passengerCar2, truck1)
    summPeople(listAuto)
    summTonnage(listAuto)

}

fun summPeople(listAuto: List<Auto>) {
    var people = 0
    for (i in listAuto) {
        people += i.transportationPeople()
    }
    println("Общее количество перевозимых людей: $people")
}

fun summTonnage(listAuto: List<Auto>) {
    var tonn = 0
    for (i in listAuto) {
        tonn += i.shipping()
    }

    println("Общий вес перевозимого груза: $tonn")
}

abstract class Auto : MovementAuto, TransportationOfPassengers, Shippingable {
    abstract val typeAuto: String
}

class PassengerCar(
    override val typeAuto: String,
    val numberOfPeople: Int
) : Auto() {
    override fun moveAuto() {
        println("$typeAuto начал своё движение")
    }

    override fun transportationPeople(): Int {
        val people = numberOfPeople
        println("Количество перевозимых пассажиров в $typeAuto: $numberOfPeople человека")
        return people
    }

    override fun shipping(): Int {
        val tonnage = 0
        println("$typeAuto не предназначен для перевозк груза")
        return tonnage
    }
}

class Truck(
    override val typeAuto: String,
    val numberOfPeople: Int,
    val tonnage: Int,
) : Auto() {
    override fun moveAuto() {
        println("$typeAuto начал своё движение")
    }

    override fun transportationPeople(): Int {
        val people = numberOfPeople
        println("Количество перевозимых пассажиров в $typeAuto: $numberOfPeople человека")
        return numberOfPeople
    }

    override fun shipping(): Int {
        val tonnage1 = tonnage
        println("Вес перевозимого груза в $typeAuto: $tonnage тонн")
        return tonnage1
    }

}

interface MovementAuto { //Передвижение авто
    fun moveAuto()
}

interface TransportationOfPassengers { // Перевозка пассажиров
    fun transportationPeople(): Int
}

interface Shippingable {
    fun shipping(): Int
}