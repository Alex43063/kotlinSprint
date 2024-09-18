package org.example

/*
    Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */

fun main() {
    val employees = 50
    val trainees = 30
    val employeeSalary = 30_000
    val traineesSalary = 20_000

    val salaryForEmployees = employees * employeeSalary
    val salaryForTrainees = trainees * traineesSalary
    val fullSalaryWithTrainees = salaryForEmployees + salaryForTrainees

    val avgSalary = fullSalaryWithTrainees / (employees + trainees)

    println(salaryForEmployees)
    println(fullSalaryWithTrainees)
    println(avgSalary)
}