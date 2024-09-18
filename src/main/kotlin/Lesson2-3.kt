package org.example

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

const val PART_OF_TIME: Int = 60
const val HOURS_OF_DAY: Int = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes = departureHour * PART_OF_TIME + departureMinute
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalHours = arrivalTimeInMinutes / PART_OF_TIME
    val arrivalDay = (arrivalTimeInMinutes / PART_OF_TIME) / HOURS_OF_DAY
    val arrivalMinutes = arrivalTimeInMinutes % PART_OF_TIME
    val tryArrivalHours = arrivalHours - arrivalDay * HOURS_OF_DAY

    print("%02d:%02d".format(tryArrivalHours, arrivalMinutes))
}