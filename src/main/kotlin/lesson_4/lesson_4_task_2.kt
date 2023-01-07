package lesson_4

fun main() {
    //данные по первому грузу
    val cargoWeightOne = 20
    val cargoVolumeOne = 80
    //данные по второму грузу
    val cargoWeightTwo = 50
    val cargoVolumeTwo = 100

    println("Average для груза весом $cargoWeightOne кг и объёмом $cargoVolumeOne л: ${((cargoWeightOne >= MIN_WEIGHT) && (cargoWeightOne == MAX_WEIGHT)) && (cargoVolumeOne < VOLUME)}")
    println("Average для груза весом $cargoWeightTwo кг и объёмом $cargoVolumeTwo л: ${((cargoWeightTwo >= MIN_WEIGHT) && (cargoWeightTwo == MAX_WEIGHT)) && (cargoVolumeTwo < VOLUME)}")
}

//константы
const val MIN_WEIGHT = 35  //минимальный вес
const val MAX_WEIGHT = 100 //максимальный вес
const val VOLUME = 100 // объём, не включительно до 100