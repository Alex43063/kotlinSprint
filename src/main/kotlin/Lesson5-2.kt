import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
fun main() {
    println("Введите год вашего рождения")
    val birthYear = readln().toInt()
    if (calculateAge(birthYear) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ запрещён")
}

fun calculateAge(yearOfBirth: Int): Int {
    val currentYear = LocalDate.now().year
    return currentYear - yearOfBirth
}