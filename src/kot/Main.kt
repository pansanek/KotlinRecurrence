package kot


fun main(args: Array<String>) {
//    val cat = Cat("Barsik",5 ,3f)
//    cat.printInfo()
//
//    println(cat.isOld)

    val programmer = Worker("Ivan","Programmer",2016)
    programmer.printInfo()
}

fun Worker.printInfo(){
    println("$name, $position, $startYear,$experience")
}