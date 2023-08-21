package kot


fun main(args: Array<String>) {
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val test = Test()
    test.insertTestData("3")
    for(str in db.data){
        println(str)
    }
}

