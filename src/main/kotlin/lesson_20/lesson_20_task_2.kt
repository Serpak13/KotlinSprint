package lesson_20

//Задача 2 к Уроку 20
//
//В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
// Создай класс игрока (у него должно быть имя, текущее и максимальное здоровье).
// Затем напиши лямбда-функцию, реализующую лечебное зелье.
// Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.
fun main() {

    val player1 = Player("Serpak", 30, 100)
    player1.infoAboutPlayer()
    val healingPotion: (Player) -> Unit = {
        player1.currentHealth = (player1.maximumHealth - player1.currentHealth) + player1.currentHealth
    }
    healingPotion(player1)
    player1.infoAboutPlayer()
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int,
) {

    fun infoAboutPlayer() {
        println("Имя игрока: $name\nТекущее здоровье: $currentHealth\nМаксимальное здоровье: $maximumHealth")
    }
}