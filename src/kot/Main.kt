package kot


fun main(args: Array<String>) {
    val revenueByWeek = listOf(
        listOf(8,6,5,1,2),
        listOf(2,4,6,1,3),
        listOf(7,3,4,2,1),
        listOf(1,4,5,7,6)
    )
    val total = revenueByWeek.flatten()
    val average = total.average()
    println(average)
}
