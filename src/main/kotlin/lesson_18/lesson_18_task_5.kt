package lesson_18

//Задача 5 к Уроку 18
//
//В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
// Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
//
//Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).
fun main() {

}

open class Screen(){
    open fun drawObject(
        typeOfGeometricObject: Circle,
        coordinateX: Float,
        coordinateY: Float,
    ){}
    open fun drawObject(
        typeOfGeometricObject: Square,
        coordinateX: Float,
        coordinateY: Float,
    ){}
    open fun drawObject(
        typeOfGeometricObject: Dot,
        coordinateX: Float,
        coordinateY: Float,
    ){}
}

class Circle: Screen(){}

class Square: Screen(){}

class Dot: Screen(){}