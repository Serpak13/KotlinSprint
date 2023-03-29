package lesson_18


//Задача 2 к Уроку 18
//
//В игре используются игральные кости с разным количеством граней: 4, 6 и 8.
// Опиши их, используя полиморфизм, создав несколько классов. У каждой кости должен быть метод, печатающий в консоль выпавшее число.
fun main() {
    val dice1: Dice = Tetrahedron()
    val dice2: Dice = Hexagon()
    val dice3: Dice = Octahedron()
    dice1.throwDice()
    println()
    dice2.throwDice()
    println()
    dice3.throwDice()

}

abstract class Dice(val  faces: Int) {
    protected val possibleNumbers = (1..faces)
    abstract fun throwDice()
}

class Tetrahedron: Dice(4) {
    override fun throwDice() {
        println("Бросок кубика с количеством граней $faces. Выпавшее число - ${possibleNumbers.random()}")
    }
}

class Hexagon: Dice(6) {
    override fun throwDice() {
        println("Бросок кубика с количеством граней $faces. Выпавшее число - ${possibleNumbers.random()}")
    }
}

class Octahedron: Dice(8) {
    override fun throwDice() {
        println("Бросок кубика с количеством граней $faces. Выпавшее число - ${possibleNumbers.random()}")
    }
}

