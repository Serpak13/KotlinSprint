package lesson_16
import kotlin.math.pow

//Задача 2 к Уроку 16
//
//Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
// Число Pi должно быть равным 3,14 и защищенным от изменений. Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
// Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.
fun main() {

    val circle1 = Circle(2.1)
    circle1.areaCircle()
    circle1.circumference()

}

class Circle(private val radiusCircle: Double) {

    private val pi = 3.14

    fun areaCircle() {
        val area = pi * radiusCircle.pow(2)
        println("Площадь круга: $area")
    }

    fun circumference (){
        val length = 2 * pi * radiusCircle
        println("Длина окружности: $length")
    }

}