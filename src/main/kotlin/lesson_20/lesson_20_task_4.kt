package lesson_20

//Задача 4 к Уроку 20
//
//В разрабатываемом приложении мы реализуем список элементов.
// Изначально он представлен списком строк.
// При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль:
// “Нажат элемент [название_элемента]”.
//
//“Нажми” каждый четный элемент списка.
fun main() {

    val listSometing = listOf<String>("элемент 0", "элемент 1", "элемент 2", "элемент 3", "элемент 4",
        "элемент 5", "элемент 6")
    val lambdaList: (List<String>) -> List<Unit> = {
        listSometing.mapIndexed { index, element ->
            if (index % 2 == 0) println("Нажат элемент $element")
        }
    }

    println(lambdaList(listSometing))
}