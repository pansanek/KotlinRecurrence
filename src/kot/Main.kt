package kot



fun main(args: Array<String>) {
    val result = modifyString(listOf(1,2,3,4,5)){it.sum()}
    println(result)
}

fun modifyString(list: List<Int>,modify:(List<Int>) ->Int):Int{
    return modify(list)
}