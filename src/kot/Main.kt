package kot

import kot.Month.*
import kot.Season.*
fun main(args: Array<String>) {
    val workers = mutableListOf<Worker>()
    workers.add(Worker("Ivan",27))
    workers.add(Worker("Gleb",22))
    workers.add(Worker("Alexey",25))
    workers.add(Programmer("Nikolay",27,"Java"))
    workers.add(Programmer("Evgeny",27,"Kotlin"))
    for(worker in workers){
        worker.work()
    }
}

