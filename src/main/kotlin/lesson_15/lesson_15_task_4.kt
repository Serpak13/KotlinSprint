package lesson_15

//Задача 4 к Уроку 15
//
//На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
// Для инструментов есть возможность найти соответствующие комплектующие. У всех товаров есть название и количество единиц на складе.
// Напиши классы для категорий товаров. В качестве поиска – отобрази сообщение «Выполняется поиск». Метод поиска реализуй через интерфейс.
fun main() {

    val musicalInstrument1 = MusicalInstrument("Музыкальный инструмент", "Гитара", 5)
    val accessory1 = Accessory("Комплектующие", "Струны для гитары", 15)
    musicalInstrument1.productInformation()
    musicalInstrument1.findStuff()
    accessory1.productInformation()


}

abstract class MusicalStuff {
    abstract val category: String
    abstract val name: String
    abstract val quantity: Int
    abstract fun productInformation()
}

class MusicalInstrument(
    override val category: String,
    override val name: String,
    override val quantity: Int,
) : MusicalStuff(), FindStuff {
    override fun productInformation() {
        println("Категория товара: $category\nНаименование: $name\nКоличество на складе: $quantity шт.")
    }
}

class Accessory(
    override val category: String,
    override val name: String,
    override val quantity: Int,
) : MusicalStuff() {
    override fun productInformation() {
        println("Категория товара: $category\nНаименование: $name\nКоличество на складе: $quantity шт.")
    }
}

interface FindStuff {
    fun findStuff() {
        println("Выполняется поиск")
    }
}