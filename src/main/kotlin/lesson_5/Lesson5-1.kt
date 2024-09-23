package lesson_5

fun main() {
    val firstNumber = (0..100).random()
    val secondNumber = (0..100).random()

    println("Введите, сумму для $firstNumber и $secondNumber")
    val answer = readln().toInt()
    if (answer == (firstNumber + secondNumber)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

