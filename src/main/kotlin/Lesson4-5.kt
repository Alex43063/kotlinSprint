const val GOOD_CONDITION_SEAMAN_MIN = 55
const val GOOD_CONDITION_SEAMAN_MAX = 70
const val GOOD_CONDITION_FOOD_BOX = 50

fun main() {
    println("Is ship broken? yes/no")
    val isBroken = readlnOrNull() == "yes"
    println("Count of seamen")
    val numOfSeamen = readlnOrNull()?.toInt()
    println("Count of boxes with food")
    val numFoodBox = readlnOrNull()?.toInt()
    println("Is good weather? yes/no")
    val isGoodWeather = readlnOrNull() == "yes"

    if (numFoodBox != null) {
        println(
            "${
                ((isBroken) && (numOfSeamen in GOOD_CONDITION_SEAMAN_MIN..GOOD_CONDITION_SEAMAN_MAX) &&
                        (numFoodBox > GOOD_CONDITION_FOOD_BOX)) ||
                        ((isBroken) && (numOfSeamen == GOOD_CONDITION_SEAMAN_MAX) &&
                                (isGoodWeather) && (numFoodBox >= GOOD_CONDITION_FOOD_BOX))
            }"
        )
    }
}

