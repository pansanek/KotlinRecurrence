package kot


fun main(args: Array<String>) {
    val data = mapOf<String,List<Int>>(
        "file1" to listOf(15,-20,45,12,15),
        "file2" to listOf(14,51,235,-23,12),
        "file3" to listOf(18,23,-46,123,12)
    )
    val average = data.filter { it.value.all {it>=0} }.flatMap{it.value}.average()

}
