fun main() {
    val listOfLuckyNumbers = listOf((0..42).random(), (0..42).random(), (0..42).random())
    val listWithUserNumbers: MutableList<Int> = mutableListOf()

    println("Введите три числа")
    for (i in 0..2) {
        listWithUserNumbers.addLast(readln().toInt())
    }

    val correctAnswers = listOfLuckyNumbers.intersect(listWithUserNumbers)

    when (correctAnswers.size) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }

    println("Правильный ответы: $listOfLuckyNumbers")
}