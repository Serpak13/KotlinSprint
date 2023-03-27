package lesson_18


//Задача 2 к Уроку 18
//
//В игре используются игральные кости с разным количеством граней: 4, 6 и 8.
// Опиши их, используя полиморфизм, создав несколько классов. У каждой кости должен быть метод, печатающий в консоль выпавшее число.
fun main() {
    val cube1: Cube = Tetrahedron()
    val cube2: Cube = Hexagon()
    val cube3: Cube = Octahedron()
    cube1.trowCube()
    println()
    cube2.trowCube()
    println()
    cube3.trowCube()

}

abstract class Cube(val dice: Int) {
    abstract fun trowCube()
}

class Tetrahedron: Cube(4) {
    override fun trowCube() {
        println("Бросок кубика с количеством граней $dice. Выпавшее число - ${(1..dice).random()}")
    }
}

class Hexagon: Cube(6) {
    override fun trowCube() {
        println("Бросок кубика с количеством граней $dice. Выпавшее число - ${(1..dice).random()}")
    }
}

class Octahedron: Cube(8) {
    override fun trowCube() {
        println("Бросок кубика с количеством граней $dice. Выпавшее число - ${(1..dice).random()}")
    }
}

