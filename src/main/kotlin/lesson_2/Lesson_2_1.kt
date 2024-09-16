package org.example.lesson_2

fun main() {
    val studentMark1 = 3
    val studentMark2 = 4
    val studentMark3 = 3
    val studentMark4 = 5
    val countOfStudents = 4f

    val avgMark = (studentMark1 + studentMark2 + studentMark3 + studentMark4) / countOfStudents

    println(String.format("%.2f", avgMark))
}