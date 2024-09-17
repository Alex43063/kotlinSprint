package org.example

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val partOfTime = 60
    val hoursInDay = 24
    val departureTimeInMinutes = departureHour * partOfTime + departureMinute
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalHours = arrivalTimeInMinutes / partOfTime
    val arrivalMinutes = arrivalTimeInMinutes % partOfTime

    val tryArrivalHours: Int = if (arrivalHours >= hoursInDay) {
        arrivalHours - hoursInDay
    } else {
        arrivalHours
    }

    print("%02d:%02d".format(tryArrivalHours, arrivalMinutes))
}