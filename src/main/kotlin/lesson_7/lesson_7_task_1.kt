package lesson_7
import java.util.concurrent.ThreadLocalRandom
//Задача 1 к Уроку 7
//
//Создай программу, которая генерирует шестизначные пароли.
// Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов).
// Например, k5p6m2.
// – для каждого символа необходимо создать отдельную переменную;
// – вывести сгенерированный пароль в консоль;
// – подсказка: использовать метод, который может генерировать рандомное число из заданного диапазона.
fun main() {
    val listOne = listOf("a","b","c","d","e","f","g","h","i","j","k","n","l","o","p","r","s","o","t")

    val symbOne = listOne.random()
    val symbTwo = ThreadLocalRandom.current().nextInt(1, 9)
    val symbTree = listOne.random()
    val symbFour = ThreadLocalRandom.current().nextInt(1, 9)
    val symbFive = listOne.random()
    val symbSix = ThreadLocalRandom.current().nextInt(1, 9)
    println("Ваш пароль: $symbOne$symbTwo$symbTree$symbFour$symbFive$symbSix")


}