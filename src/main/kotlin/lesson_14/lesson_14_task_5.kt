package lesson_14

import kotlin.math.PI
import kotlin.math.pow

//Задача 5 к Уроку 14
//
//Напиши программу, которая будет описывать геометрические фигуры: круг, прямоугольник и треугольник.
// Все фигуры имеют свой цвет, а также свои индивидуальные параметры: у круга это радиус окружности;
// у прямоугольника – ширина и высота; у треугольника – длины каждой стороны.
//
// – создай абстрактный класс Figure с полем color;
//
// – у класса Figure определи два абстрактных метода: реализация первого метода должна возвращать площадь фигуры, а реализация второго – возвращать ее периметр;
//
// – создай 3 класса наследника для фигур  Circle, Rectangle  и Triangle  с соответствующими полями;
//
// – в этих же классах, реализуй методы для каждой из геометрических фигур (формулы для вычисления площади и периметра можно нагуглить);
//
// – после этого создай по 2 объекта с различными цветами (красный, черный, зеленый) и произвольными размерами для каждой фигуры;
//
// – наконец, создай 2 метода: первый, принимая на вход список геометрических фигур, должен вернуть сумму периметров красных фигур;
// второй, также принимая на вход список, должен вернуть сумму площадей красных фигур;
//
// – вызови эти два метода с массивом созданных объектов фигур  и выведи результат в консоль.
fun main() {
    //Круги
    val circle1 = Circle("Красный", 10.0)
    val circle2 = Circle("Зелёный", 7.5)
    //Прямоугольники
    val rectangle1 = Rectangle("Чёрный", 5.5, 10.0)
    val rectangle2 = Rectangle("Красный", 6.0, 7.0)
    //Треугольники
    val triangle1 = Triangle("Зелёный", 4.0, 1.5, 5.0)
    val triangle2 = Triangle("Чёрный", 4.7, 5.1, 9.0)
    //Список фигур
    val listFigure: List<Figure> = mutableListOf<Figure>(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)

    redFigureSumArea(listFigure)
    redFigureSumPerimetr(listFigure)
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculationArea(): Double
    abstract fun calculationPerimetr(): Double


}

class Circle(
    color: String,
    val circleRadius: Double,
) : Figure(color) {
    override fun calculationArea(): Double {
        val areaCircle = (circleRadius.pow(2)) * PI
        println("Площадь круга $color: $areaCircle")
        return areaCircle
    }

    override fun calculationPerimetr(): Double {
        val perimetrCircle = 2 * PI * circleRadius
        println("Длина окружности $color: $perimetrCircle")
        return perimetrCircle
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculationArea(): Double {
        val areaRectangle = width * height
        println("Площадь прямоугольника $color: $areaRectangle")
        return areaRectangle
    }

    override fun calculationPerimetr(): Double {
        val perimetrRectangle = 2 * (width + height)
        println("Периметр прямоугольника $color: $perimetrRectangle")
        return perimetrRectangle
    }

}

class Triangle(
    color: String,
    val length1: Double,
    val length2: Double,
    val length3: Double,
) : Figure(color) {
    override fun calculationArea(): Double {
        val perimeterTriangle = length1 + length2 + length3  //Периметр
        val semiPerimetrTriangle = perimeterTriangle / 2  //Полупериметр
        val areaTriangle =
            (semiPerimetrTriangle * (semiPerimetrTriangle - length1) * (semiPerimetrTriangle - length2) * (semiPerimetrTriangle - length3)).pow(
                0.5
            )
        println("Площадь треугольника $color: $areaTriangle")
        return areaTriangle
    }

    override fun calculationPerimetr(): Double {
        val perimeterTriangle = length1 + length2 + length3  //Периметр
        println("Периметр треугольника $color: $perimeterTriangle")
        return perimeterTriangle
    }

}

fun redFigureSumPerimetr(listFigure: List<Figure>) {
    var sumPerimetr: Double = 0.0
    for (i in listFigure) {
        if (i.color == "Красный") {
            sumPerimetr += i.calculationPerimetr()
        }
    }
    println("Сумма периметра красных фигур: $sumPerimetr")
}

fun redFigureSumArea(listFigure: List<Figure>) {
    var sumArea: Double = 0.0
    for (i in listFigure) {
        if (i.color == "Красный") {
            sumArea += i.calculationArea()
        }
    }
    println("Сумма площади красных фигур: $sumArea")
}