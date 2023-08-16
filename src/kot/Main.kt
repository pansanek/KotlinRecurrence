package kot


fun main(args: Array<String>) {
    val list = listOf<Int>()
    val string = "fgdsfsdf"
    val obj = mutableMapOf<String, String>()
    myWith(list) {
        sum()
        average()
    }
    myWith(string) {
        println(this.toUpperCase())
    }
    myWith(obj) {
        keys
        values
    }


}

//fun myWith(list:List<Int>, operation:List<Int>.()->Unit){
//    list.operation()
//}
//
//fun myWith(string: String, operation:String.()->Unit){
//    string.operation()
//}

inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}