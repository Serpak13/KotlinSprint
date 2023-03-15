package lesson_17


//Создай класс, описывающий элемент викторины.
// В конструкторе два текстовых свойства: вопрос и ответ. Явно пропиши для вопроса сеттер, для ответа сеттер и геттер.
fun main() {
    val quiz1 = Quiz("В каких единицах измеряется световой поток?", "В люменах")
    println(quiz1.question)
    println(quiz1.answer)
    quiz1.question = "В чём измеряется давление?"
    quiz1.answer = "В Паскалях"
    println(quiz1.question)
    println(quiz1.answer)

}

class Quiz(question: String, answer: String) {
    var question: String = question
        set(value) {
            field = value
        }
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}