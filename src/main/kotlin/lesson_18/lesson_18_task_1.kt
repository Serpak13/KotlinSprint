package lesson_18

//Задача 1 к Уроку 18
//
//CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине.
// Заказ содержит информацию: номер заказа и товары. Если товар один, он хранится в виде строки, если несколько – в виде списка строк.
//
//По запросу нужно печатать в консоль сообщение
// «Заказан товар: [название_товара]» или «Заказаны следующие товары: [название_товара], … [название_товара]».
// Создай 2 объекта заказа и вызови у них метод вывода информации и заказе. Реши задачу, используя полиморфизм.
fun main() {

    val order1: Order = OneOrder(5, "Бумага")
    val order2: Order = ListOrder(8, listOf("точилка", "ручка", "транспортир"))

    order1.getOrderInfo()
    order2.getOrderInfo()
}

open class Order{
    open fun getOrderInfo() = " "

}

class OneOrder(val numberOfOrder: Int, val nameProduct: String): Order(){
    override fun getOrderInfo(): String {
        return "Номер заказа $numberOfOrder. Заказан товар: $nameProduct"
    }
}

class ListOrder(val numberOfOrder: Int, val nameProduct: List<String>): Order(){

    override fun getOrderInfo(): String {
        return "Номер заказа $numberOfOrder. Заказан товар: $nameProduct"
    }
}

