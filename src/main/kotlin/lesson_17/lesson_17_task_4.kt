package lesson_17

//Задача 4 к Уроку 17
//
//Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение. Нужно написать класс посылки.
// Должно быть неизменяемое поле с номером и поле с текущим местоположением в виде строки.
//
//Также должен быть счетчик перемещений, обновляющийся при перезаписи местоположения.
//
//Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации использовать сеттер.
fun main() {
    val package1 = Package(123, "Moscow")
    package1.location = "Saint-P"
    package1.location = "Tomsk"
    package1.location = "Saratov"
    package1.infoAboutPackage()
}

class Package(private val numberOfPackage: Int, var locationPackage: String) {

    var countMoving = 0  //счётчик перемещений
    var location = locationPackage
        set(value) {
            field = value
            countMoving++
        }

    fun infoAboutPackage() {
        println("Номер посылки: $numberOfPackage")
        println("Местонахождение: $location")
        println("Количество перемещений: $countMoving")
    }


}