const val MIN_WIGHT_KG: Byte = 35
const val MAX_WIGHT_KG: Byte = 100
const val MAX_SIZE_L: Byte = 100
fun main() {
    val firstCargoWight = 20
    val firstCargoSize = 80
    val secondCargoWith = 50
    val secondCargoSize = 100

    println(
        "Груз с весом $firstCargoWight кг и объемом $firstCargoSize л соответствует категории 'Average': " +
                "${firstCargoWight > MIN_WIGHT_KG && firstCargoWight <= MAX_WIGHT_KG && firstCargoSize < MAX_SIZE_L}"
    )

    println(
        "Груз с весом $secondCargoWith кг и объемом $secondCargoSize л соответствует категории 'Average': " +
                "${secondCargoWith > MIN_WIGHT_KG && secondCargoWith <= MAX_WIGHT_KG && secondCargoSize < MAX_SIZE_L}"
    )

}