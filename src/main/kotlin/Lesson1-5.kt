package org.example

fun main() {
    val partOfTime = 60
    val seconds = 6460
    val minutes = seconds / partOfTime
    val secondsInTime = seconds % partOfTime
    val hours = minutes / partOfTime
    val minutesInTime = minutes / partOfTime

    println("%02d:%02d:%02d".format(hours, minutesInTime, secondsInTime))
}