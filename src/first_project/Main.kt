package first_project

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

    // Print the items list and calcule de income
    println("Earned amount:")
    var income = 0
    for((name, price) in itemsMap) {
        println("$name: \$$price")
        income += price
    }

    // Print the total
    println()
    println("Income: \$$income")
}
