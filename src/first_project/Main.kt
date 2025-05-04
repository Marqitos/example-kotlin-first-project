package first_project

import java.util.Scanner

fun main() {
    // Set the items
    val itemsMap = mapOf(
        "Bubblegum" to 202,
        "Toffee" to 118,
        "Ice cream" to 2250,
        "Milk chocolate" to 1680,
        "Doughnut" to 1075,
        "Pancake" to 80
    )

    // Print the items list
    println("Earned amount:")
    var income = 0
    for((name, price) in itemsMap) {
        println("$name: \$$price")
        income += price
    }

    // Print the total
    println()
    println("Income: \$$income")

    // Initialize Java Scanner
    val scanner = Scanner(System.`in`)

    // Ask expenses
    println("Staff expenses:")
    val expenses = scanner.nextInt()
    println("Other expenses:")
    val otherExpenses = scanner.nextInt()

    // Print net income
    val totalIncome = income - expenses - otherExpenses
    println("Net income: \$$totalIncome")

    // Free resources
    scanner.close()
}
