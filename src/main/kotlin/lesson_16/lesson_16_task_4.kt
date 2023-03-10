package lesson_16

//Задача 4 к Уроку 16
//
//Создать класс, описывающий заказ в интернет-магазине. В заказе должны быть номер заказа и статус готовности.
// Номер заказа должен быть недоступен для изменения.
//
//Создай метод, который меняет статус заказа.
// Поменять статус заказа можно только отправив заявку менеджеру.
// Имитируй это действие отдельной функцией.
// Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.
fun main() {

    val order1 = Order(456, "В обработке")
    order1.getStatus()
    order1.updateStatus("Заказ готов")
    println(order1.getStatus())
}

class Order(private val orderNumber: Int, private var status: String) {

    fun getStatus(): String {
        return status
    }

    fun updateStatus(newStatus: String) {
        // Отправка заявки менеджеру для изменения статуса заказа
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        // Внутренний метод, изменяющий статус заказа
        status = newStatus
    }
}