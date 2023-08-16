package kot


fun main(args: Array<String>) {
    val data = mapOf(
        "Январь" to listOf(15,-20,45,12),
        "Февраль" to listOf(14,51,235,23),
        "Март" to listOf(18,23,46,123),
        "Сентябрь" to listOf(18,23,46,123),
        "Апрель" to listOf(135,324,-46,1234)
    )

    printInfo(data)

}

fun printInfo(data: Map<String,List<Int>>) {

    val validData = data.filter { it.value.all {it>0} }

    val averageWeek = validData.flatMap { it.value }.average()
    println("Average week: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()

    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }.keys
    val minMonth = validData.filter { it.value.sum() == min }.keys

    println("Average month: $averageMonth")
    println("Max: $max")
    print("Max month: ")
    for (month in maxMonth) {
        println("$month ")
    }
    println("Min: $min")
    print("Min month: ")
    for (month in minMonth) {
        println("$month ")
    }

    val invalidData = data.filter { it.value.any {it<0} }
    val errorMonth = invalidData.keys
    println("Error month: ")
    for (month in errorMonth) {
        print("$month, ")
    }
}
