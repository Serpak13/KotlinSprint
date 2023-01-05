package lesson_4

fun main() {


    val cargoWeightOne = 20
    val cargoVolumeOne = 80

    val cargoWeightTwo = 50
    val cargoVolumeTwo = 100

    println("Average для груза весом $cargoWeightOne кг и объёмом $cargoVolumeOne л: ${((cargoWeightOne >= MIN_WEIGHT ) || (cargoWeightOne == MAX_WEIGHT)) && (cargoVolumeOne <= VOLUME)}")
    println("Average для груза весом $cargoWeightTwo кг и объёмом $cargoVolumeTwo л: ${((cargoWeightTwo >= MIN_WEIGHT ) || (cargoWeightTwo == MAX_WEIGHT)) && (cargoVolumeTwo <= VOLUME)}")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUME = 100