package lesson_19

//Задача 2 к Уроку 19
//
//В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
//
// – создай enum класс с категориями;
// – создай метод, который примет тип категории и вернет текстовое название категории для пользователя;
// – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод, который выводит
//  инфо о товаре. Вызови его для нескольких созданных товаров;
// – для вывода информации о товаре, для категории используй метод определения категории.
fun main() {

    val product1 = ProductDescription("Свитшот", 1564, Category.CLOTHES)
    val product2 = ProductDescription("Степлер", 5896, Category.CHANCELLERY)
    val product3 = ProductDescription("Мочалка", 8526, Category.OTHER)

    println(product1.getInfoAboutProduct())
    println()
    println(product2.getInfoAboutProduct())
    println()
    println(product3.getInfoAboutProduct())
}

data class ProductDescription(val nameProduct: String, val id: Int, val category: Category) {

    fun getInfoAboutProduct(): String {
        return "Название товара:$nameProduct\nАртикул товара:$id\nКатегория товара:${getNameCategory(category)}"
    }
}

enum class Category {
    CLOTHES,
    CHANCELLERY,
    OTHER;
}
fun getNameCategory(category: Category): String {
   return when (category) {
        Category.CLOTHES -> "Одежда"
        Category.CHANCELLERY -> "Канцелярия"
        Category.OTHER -> "Другое"
    }
}