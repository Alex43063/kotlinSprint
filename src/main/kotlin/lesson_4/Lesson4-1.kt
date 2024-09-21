package lesson_4

const val ALL_TABLE = 13

fun main() {
    val bookedTableToday = 13
    val bookedTableYesterday = 9
    println("Доступность столиков на сегодня: ${bookedTableToday < ALL_TABLE}")
    println("Доступность столиков на завтра: ${bookedTableYesterday < ALL_TABLE}")
}