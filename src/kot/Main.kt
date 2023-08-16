package kot



fun main(args: Array<String>) {
    val result = modifyString("Hello"){it.toUpperCase()}
    println(result)
}

fun modifyString(string: String,modify:(String) ->String):String{
    return modify(string)
}