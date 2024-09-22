package lesson_5

import kotlin.random.Random

fun main() {
    val firstNumber = Random.nextInt(0, 100)
    val secondNumber = Random.nextInt(0, 100)

    println("Введите, сумму для $firstNumber и $secondNumber")
    val answer = readln().toInt()
    if (answer == (firstNumber + secondNumber)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

