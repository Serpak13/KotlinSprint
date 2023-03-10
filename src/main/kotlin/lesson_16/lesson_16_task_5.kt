package lesson_16

//Задача 5 к Уроку 16
//
//Для компьютерной игры создать класс игрока. У него есть имя, здоровье и сила удара.
// Здоровье должно изменяться только через методы получения урона и лечения.
//
//Добавить приватный метод death(), который вызывается, если при получении урона заканчивается здоровье.
// Смерть обнуляет силу удара, здоровье и не позволяет лечиться.
//
//Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.
fun main() {

    val player1 = Player("Serpak", 100, 50)
    player1.damage(10)
    player1.healing(5)
    player1.damage(95)
    player1.infoAboutPlayer()

}

class Player(private val name: String, private var health:  Int, private var powerHit: Int){

    fun infoAboutPlayer(){
        println("Имя персонажа: $name\nЗдоровье: $health\nСила удара: $powerHit")
    }
    fun damage(damage: Int){
        health -= damage
        if(health == 0){
            death()
        }
    }

    fun healing(heal: Int){
        health += heal
    }
    private fun death(){
        powerHit = 0
        healing(0)
        println("Вы мертвы")
    }


}