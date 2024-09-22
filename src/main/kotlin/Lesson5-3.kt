
const val FIRST_LUCKY_NUMBER = 0
const val SECOND_LUCKY_NUMBER = 10
fun main() {
    println("Введите первое число")
    val firstNumberFromUser = readln().toInt()

    println("Введите второе число")
    val secondNumberFromUser = readln().toInt()

    if ((firstNumberFromUser == FIRST_LUCKY_NUMBER || firstNumberFromUser == SECOND_LUCKY_NUMBER) &&
        (secondNumberFromUser == FIRST_LUCKY_NUMBER || secondNumberFromUser == SECOND_LUCKY_NUMBER)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstNumberFromUser == FIRST_LUCKY_NUMBER || firstNumberFromUser == SECOND_LUCKY_NUMBER) ||
        (secondNumberFromUser == FIRST_LUCKY_NUMBER || secondNumberFromUser == SECOND_LUCKY_NUMBER)
    )
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")
}
