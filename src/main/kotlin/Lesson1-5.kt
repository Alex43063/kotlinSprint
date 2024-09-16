package org.example

fun main() {
    val seconds = 6460
    val minutes = seconds / 60
    val secondsInTime = seconds % 60
    val hours = minutes / 60
    val minutesInTime = minutes / 60

    println("${String.format("%02d", hours)}:${String.format("%02d", minutesInTime)}:${String.format("%02d", secondsInTime)}")
}