package kot


fun main(args: Array<String>) {
    val array = generateSequence("Сотрудник №1"){
        val index = it.substring(11).toInt()
        "Сотрудник №${index+1}"
    }
    val listOfFirst100 = array.take(100)
    for(employee in listOfFirst100) println(employee)
}
