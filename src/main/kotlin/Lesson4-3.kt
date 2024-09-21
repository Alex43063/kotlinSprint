const val GOOD_CONDITIONS_IS_SUNNY_DAY = true
const val GOOD_CONDITIONS_TENT_IS_OPENED = true
const val GOOD_CONDITIONS_AIR_HUMIDITY = 20
const val NOT_GOOD_CONDITIONS_TYPE_SEASON = "Winter"

fun main() {
    val isSunnyDay = true
    val isOpenedTent = true
    val airHumidity = 20
    val typeOfSeason = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(isSunnyDay == GOOD_CONDITIONS_IS_SUNNY_DAY) && (isOpenedTent == GOOD_CONDITIONS_TENT_IS_OPENED) && 
                    (airHumidity == GOOD_CONDITIONS_AIR_HUMIDITY) && (typeOfSeason != NOT_GOOD_CONDITIONS_TYPE_SEASON)}")
}