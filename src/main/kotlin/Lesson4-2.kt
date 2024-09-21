const val minWightKg: Byte = 35
const val maxWightKg: Byte = 100
const val maxSizeL: Byte = 100
fun main() {
    val firstCargoWight = 20
    val firstCargoSize = 80
    val secondCargoWith = 50
    val secondCargoSize = 100

    println(
        "Груз с весом $firstCargoWight кг и объемом $firstCargoSize л соответствует категории 'Average': " +
                "${firstCargoWight > minWightKg && firstCargoWight <= maxWightKg && firstCargoSize < maxSizeL}"
    )

    println(
        "Груз с весом $secondCargoWith кг и объемом $secondCargoSize л соответствует категории 'Average': " +
                "${secondCargoWith > minWightKg && secondCargoWith <= maxWightKg && secondCargoSize < maxSizeL}"
    )

}