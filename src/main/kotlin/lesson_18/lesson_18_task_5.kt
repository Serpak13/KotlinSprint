package lesson_18

//Задача 5 к Уроку 18
//
//В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
// Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
//
//Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
fun main() {
    val circle: Screen = Circle()
    val square: Screen = Square()
    val dot: Screen = Dot()
    circle.drawObject(Circle(), 5.5f,6.6f)
    square.drawObject(Square(), 9.5f,6.1f)
    dot.drawObject(Dot(), 1.5f,5.6f)
}

open class Screen(){
    open fun drawObject(
        typeOfGeometricObject: Circle,
        coordinateX: Float,
        coordinateY: Float,
    ){
        println("Тип фигуры: $typeOfGeometricObject\nКоордината Х: $coordinateX\nКоордината Y: $coordinateY")
    }
    open fun drawObject(
        typeOfGeometricObject: Square,
        coordinateX: Float,
        coordinateY: Float,
    ){
        println("Тип фигуры: $typeOfGeometricObject\nКоордината Х: $coordinateX\nКоордината Y: $coordinateY")
    }
    open fun drawObject(
        typeOfGeometricObject: Dot,
        coordinateX: Float,
        coordinateY: Float,
    ){
        println("Тип фигуры: $typeOfGeometricObject\nКоордината Х: $coordinateX\nКоордината Y: $coordinateY")
    }
}

class Circle: Screen(){}

class Square: Screen(){}

class Dot: Screen(){}