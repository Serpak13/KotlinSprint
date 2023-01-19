package lesson_9


//Задача 5 к Уроку 9
//
//Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
//
// – результат должен исключать повторы;
// – список должен выводиться в алфавитном порядке;
// – все элементы списка выведены в одну строку, разделяя слова запятыми;
// – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.
fun main() {

    val mSet = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент №$i")
        mSet.add(readLine()!!)
    }

    val mList = mSet.sorted().toMutableList()
    mList[0] = mList[0].replaceRange(0, 1, mList[0][0].uppercase())
    mList[mList.lastIndex] = mList[mList.lastIndex] + '.'

    println(mList)


}




