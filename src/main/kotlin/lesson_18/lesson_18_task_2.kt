package lesson_18


//Задача 2 к Уроку 18
//
//В игре используются игральные кости с разным количеством граней: 4, 6 и 8.
// Опиши их, используя полиморфизм, создав несколько классов. У каждой кости должен быть метод, печатающий в консоль выпавшее число.
fun main() {
    val cube1: Dice = Tetrahedron()
    val cube2: Dice = Hexagon()
    val cube3: Dice = Octahedron()
    cube1.trowCube()
    println()
    cube2.trowCube()
    println()
    cube3.trowCube()

}

abstract class Dice(val  faces: Int) {
    abstract fun trowCube()
}

class Tetrahedron: Dice(4) {
    override fun trowCube() {
        val number = (1..faces).random()
        println("Бросок кубика с количеством граней $faces. Выпавшее число - $number")
    }
}

class Hexagon: Dice(6) {
    override fun trowCube() {
        val number = (1..faces).random()
        println("Бросок кубика с количеством граней $faces. Выпавшее число - $number")
    }
}

class Octahedron: Dice(8) {
    override fun trowCube() {
        val number = (1..faces).random()
        println("Бросок кубика с количеством граней $faces. Выпавшее число - $number")
    }
}

