package lesson_19

//Задача 1 к Уроку 19
//
//В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish), петушок (Siamese fighting fish).
// Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.
fun main() {

    println("Вы можете добавить в аквариум следующих рыб:")

    for (i in Fish.values()){
        println(i.nameFish)
    }


}

enum class Fish(val nameFish: String){
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESFIGHTINGFISH("Петушок"),
}