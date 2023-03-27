package lesson_18

//Задача 4 к Уроку 18
//
//В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
// Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
//
//Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб, то только с длиной ребра.
fun main() {

    val recPackage: RectanglePackage = RectanglePackage("Прямоугольная", 8,9,1)
    recPackage.area()
    println()
    val cubePackage: CubePackage = CubePackage("Кубическая",2)
    cubePackage.area()
}

abstract class Package{
    abstract fun area()
}

class RectanglePackage(
    private val type: String,
    private val length: Int,
    private val width: Int,
    private val height: Int,
): Package() {
    override fun area() {
        val areaReactangle = ((length * height)*2) + ((width * height)*2) + ((length * width)*2)
        println("Тип посылки: $type\nПлощадь поверхности посылки: $areaReactangle")
    }
}

class CubePackage(
    private val type: String,
    private val length: Int,
): Package() {
    override fun area() {
        val areaCube = (length * length) * 6
        println("Тип посылки: $type\nПлощадь поверхности посылки: $areaCube")
    }
}