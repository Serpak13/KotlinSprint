package lesson_4


fun main() {
    //вводные данные
    println("Введине данные о повреждениях корпуса")
    val damage = readLine()!!.toBoolean()
    println("Введине данные о численности экипажа")
    val crew = readLine()!!.toInt()
    println("Введине данные о количестве провизии")
    val boxes = readLine()!!.toInt()
    println("Введине данные о метеоусловиях")
    val meteor = readLine()!!.toBoolean()
    //УСЛОВИЕ
    if ((damage == DAMAGE_HULL) && ((CREW_SUM_MIN <= crew) and (crew < CREW_SUM_REC)) && (BOXES_OF_PROV < boxes) && ((meteor == METEOR_CONDITIONS) or (meteor !== METEOR_CONDITIONS))) {
        println("Вылет корабля возможен")
    } else if (((damage == DAMAGE_HULL) or (damage !== DAMAGE_HULL)) && (crew == CREW_SUM_REC) && (BOXES_OF_PROV < boxes) && (meteor == METEOR_CONDITIONS)) {
        println("Вылет корабля возможен")
    } else {
        println("Вылет запрещён")
    }

}

const val DAMAGE_HULL = false
const val CREW_SUM_MIN = 55
const val CREW_SUM_REC = 70 // не включительно
const val BOXES_OF_PROV = 50 // больше 50 ящиков
const val METEOR_CONDITIONS = true
