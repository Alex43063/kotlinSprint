package lesson_3/*
В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
Игрок начал партию ходом из E2 в E4.
Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.

 – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
 Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).

 – Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход белых.
 Определить, какое значение будет в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся на одну клетку вперед.
 */

fun main() {
    var startPosition = "E2"
    var finishPosition = "E4"
    var numberOfStep = 1
    var infoAboutStep = "[$startPosition-$finishPosition; $numberOfStep]"

    println(infoAboutStep)

    startPosition = "D2"
    finishPosition = "D3"
    numberOfStep = 2
    infoAboutStep = "[$startPosition-$finishPosition; $numberOfStep]"

    println(infoAboutStep)
}