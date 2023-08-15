package kot


fun main(args: Array<String>) {
    val fullNames = mutableListOf<String>()
    for(i in 0..1000){
        fullNames.add("Имя $i, Фамилия $i")
    }
    val names = fullNames.map{ it.substringBefore(",")}
    val lastNames= fullNames.map{ it.substringAfter(",")}
    val users = names.zip(lastNames)
    for(user in users){
        println(user.first + user.second)
    }
}
