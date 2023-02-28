package lesson_15

//Задача 2 к Уроку 15
//
//Программа, управляющая погодной станцией, должна отправлять сообщения на сервер.
// Напиши абстрактный класс базового сообщения с возможностью подключиться к серверу и отправить данные.
// Итого будет два метода и одно поле абстрактного класса. Затем создай подклассы сообщений о температуре и количестве осадков.
// Протестируй работу программы.
fun main() {

    val temperatureInformation1 = TemperatureInformation("Данные о температуре", 27.5, "Понедельник")
    val precipitationInformation1 = PrecipitationInformation("Информация об осадках", "Идёт дождь", "Понедельник")
    temperatureInformation1.serverConnection()
    temperatureInformation1.sendData()
    precipitationInformation1.serverConnection()
    precipitationInformation1.sendData()
}
abstract class SendMessageApp(
    val nameMessage: String,

){
    abstract fun serverConnection()
    abstract fun sendData()
}

class TemperatureInformation(
    nameMessage: String,
    val temperature: Double,
    val dayOfWeek: String,
): SendMessageApp(nameMessage){
    override fun serverConnection() {
        println("Подключение к серверу данных температурных условий выполнено")
    }

    override fun sendData() {
        println("Температура на $dayOfWeek: $temperature по цельсию")
    }
}

class PrecipitationInformation(
    nameMessage: String,
    val precipitation: String,
    val dayOfWeek: String,
): SendMessageApp(nameMessage){
    override fun serverConnection() {
        println("Подключение к серверу данных по осадкам выполнено")
    }

    override fun sendData() {
        println("Данные по осадкам на $dayOfWeek: $precipitation")
    }
}