package lesson_14


//Задача 4 к Уроку 14
//
//В компьютерной игре существуют планеты. У некоторых из них есть спутники. Планеты и спутники могут быть обитаемыми,
// могут иметь атмосферу, воду, могут быть пригодными для высадки. Создай родительский класс, описывающий небесные тела,
// и подклассы, описывающие планеты и спутники. Затем создай планету с двумя спутниками и выведи в консоль имя планеты и имена всех спутников.
fun main() {

    val planet1 = Planet("Планета",24, "Солнечная система", "Марс", possibilityOfLanding = true, haveSatellite = true)
    val satellite1 = Satellite("Спутник",15,"Солнечная система", "Фобос", 27,355)
    val satellite2 = Satellite("Спутник",15,"Солнечная система", "Деймос", 29,156)
    planet1.informationAboutObjectSpace()
    planet1.informationAboutPlanet()
    println()
    satellite1.informationAboutObjectSpace()
    satellite1.informationAboutSatellite()
    println()
    satellite2.informationAboutObjectSpace()
    satellite2.informationAboutSatellite()
}

open class ObjectSpace(
    //Небесные тела
    val typeObjectSpace: String,  //Тип небесного тела
    val movementSpeed: Int,  //Скорость передвижения
    val location: String,  //Местоположения
    ) {
    fun informationAboutObjectSpace(){
        println("Тип небесного тела: $typeObjectSpace\nСкорость передвижения: $movementSpeed км/сек\nМестоположения: $location")
    }
}

class Planet( //Планета
    typeObjectSpace: String,  //Тип небесного тела
    movementSpeed: Int,  //Скорость передвижения
    location: String,  //Местоположения
    val namePlanet: String,  //Имя
    val atmosphere: Boolean = false,  //Наличие Атмосферы
    val water: Boolean = false,   //Наличие Воды
    val habitable: Boolean = false,  //пригодность для жилья
    val possibilityOfLanding: Boolean = false,  //возможность посадки
    val haveSatellite: Boolean = false, //Наличие спутника
): ObjectSpace(typeObjectSpace, movementSpeed, location) {
    fun informationAboutPlanet(){
        println("Название планеты: $namePlanet\nНаличие атмосферы: $atmosphere\nНаличие воды: $water\nПригодность для жилья: $habitable\n" +
                "Возможность посадки: $possibilityOfLanding\nНаличие спутника: $haveSatellite")

    }
}

class Satellite( //Спутник
    typeObjectSpace: String,  //Тип небесного тела
    movementSpeed: Int,  //Скорость передвижения
    location: String,  //Местоположения
    val nameSatellite: String,  //Имя
    val periodOfCirculation: Int,  //Период вращения вокруг планеты
    val orbitRadius: Int,   //Радиус орбиты
): ObjectSpace(typeObjectSpace, movementSpeed, location) {
    fun informationAboutSatellite(){
        println("Имя спутника: $nameSatellite\nПериод вращения вокруг планеты: $periodOfCirculation в сутках\nРадиус орбиты:$orbitRadius тыс.км")
    }
}