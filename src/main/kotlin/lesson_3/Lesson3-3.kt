package lesson_3/*
Задача 3 к Уроку 3

Пишем программу, которая будет помогать учить таблицу умножения. В отдельную переменную будет записываться число (объявить и проинициализировать), а выводиться будет таблица умножения для этого числа. Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
 */

fun main() {
    val numForMultiplication = 6

    print("""
        $numForMultiplication x 1 = ${numForMultiplication * 1}
        $numForMultiplication x 2 = ${numForMultiplication * 2}
        $numForMultiplication x 3 = ${numForMultiplication * 3}
        $numForMultiplication x 4 = ${numForMultiplication * 4}
        $numForMultiplication x 5 = ${numForMultiplication * 5}
        $numForMultiplication x 6 = ${numForMultiplication * 6}
        $numForMultiplication x 7 = ${numForMultiplication * 7}
        $numForMultiplication x 8 = ${numForMultiplication * 8}
        $numForMultiplication x 9 = ${numForMultiplication * 9}
    """.trimIndent())
}