package org.example

var countOfOrders: Int = 75
val purchaseThanking: String = "Thank you for your purchase"
var employeesOfStore: Int = 2000

fun main(args: Array<String>) {
    println(countOfOrders)
    println(purchaseThanking)
//    println(employeesOfStore)
    employeesOfStore -= 1
    println(employeesOfStore)
}