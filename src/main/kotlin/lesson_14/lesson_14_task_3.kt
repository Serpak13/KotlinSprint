package lesson_14


//Задача 3 к Уроку 14
//
//Создай 2 класса. Первый (родительский) описывает сообщение на форуме. Нужно хранить текст сообщения и имя автора.
// Второй (наследующий) класс – для комментариев.
//
// – нужен метод, имитирующий публикацию поста на форуме. Сообщение должно содержать текст и автора поста;
// – нужен еще один метод для имитации комментария к посту. Сообщение должно содержать текст и автора комментария,
// а также информацию о посте, к которому оставлен комментарий;
// – выведи в консоль пост и комментарий к нему.
fun main() {

    val post1 = ForumMessagePost("Alex", "Эвальвента, что это и с чем её едят?", "Привет, подскажите пожалуйста, " +
            "кто-нибудь может объяснить, в чём особенность эвальвентного зацепления?")
    post1.createPost()
    println()
    val comment1 = ForumComment("Viktor", "Эвальвента, что это и с чем её едят?", "Привет, главное достоинство это " +
            "возможность использования технологического оборудования в три смены, 365 дней в году")
    comment1.createComment()
}

open class ForumMessagePost(
    val nameAuthor: String,   //имя автора
    val titelPost: String,      // Название поста
    val messageText: String,       //Текст поста
){
    fun createPost(){
        println("Тема поста:$titelPost")
        println("Автор поста: $nameAuthor")
        println(messageText)
    }
}

class ForumComment(
    nameAuthor: String,
    titelPost: String,
    messageText: String,
    val linkPostTitle: String = titelPost,

): ForumMessagePost(nameAuthor, titelPost, messageText)
{
    fun createComment(){
        println("Автор комментария: $nameAuthor")
        println("Комментарий к посту: $linkPostTitle")
        println(messageText)
    }
}