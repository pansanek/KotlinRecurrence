package kot

import kot.Month.*
import kot.Season.*
fun main(args: Array<String>) {
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Ivan",27))
    workers.add(Seller("Gleb",22))
    workers.add(Seller("Alexey",25))
    workers.add(Programmer("Nikolay",27,"Java"))
    workers.add(Programmer("Evgeny",27,"Kotlin"))
    workers.add(Director("Victor",50))
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for(cleaner in cleaners){
        cleaner.clean()
    }
//    for(worker in workers){
//        worker.work()
//        worker as Cleaner
//        worker.clean()
//    }
}

