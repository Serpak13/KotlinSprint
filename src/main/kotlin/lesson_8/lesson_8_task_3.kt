package lesson_8
//Скопируй предыдущее задание.
// Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте,
// но не используя циклы для поиска.
fun main() {
    val arrayOfIngredients = arrayOf("горох", "картофель", "огурец", "яйцо", "мясо", "морковь", "зелень", "майонез")
    println("Введите название ингредиента, чтобы проверить его наличие в рецепте")
    val userChoice = readLine()
    val isContains = arrayOfIngredients.contains(userChoice)
    if (isContains) {
        println("Ингредиент $userChoice в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}