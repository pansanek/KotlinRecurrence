package kot


fun main(args: Array<String>) {
    val array = (0..1000).toList()
    val employees = array.map { "Employee #$it" }
    val first30 = employees.take(30)
    for (employee in first30){
        println(employee)
    }
    val dropfirst30 = employees.drop(30)
    for (employee in dropfirst30){
        println(employee)
    }
}
