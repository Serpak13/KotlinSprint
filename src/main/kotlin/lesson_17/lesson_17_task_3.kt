package lesson_17

//Задача 3 к Уроку 17
//
//В приложении для хранения облачных файлов есть папки и файлы. Создай класс папки, который имеет имя,
// количество файлов и флаг “секретно”. Если флаг имеет значение true, то при попытке прочитать имя,
// возвращать строку “скрытая папка” и количество файлов – 0.
// В ином случай возвращать ее название и реальное количество файлов.
//
//Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных. Используй геттеры.
fun main() {
    val folder1 = Folder("Схемы", 20, false)
    val folder2 = Folder("Сметы", 15, true)

    folder1.infoAboutFolder()
    folder2.infoAboutFolder()

}

class Folder(private var nameFolder: String, private val quantityOfFiles: Int, val secret: Boolean) {

    var name = nameFolder
        get() = if (secret) "Скрытая папка" else field
    var quantity = quantityOfFiles
        get() = if(secret) 0 else field

    fun infoAboutFolder(){
        println("Имя папки: $name")
        println("Количество файлов: $quantity")
    }

}
