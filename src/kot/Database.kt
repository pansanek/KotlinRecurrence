package kot

object Database {
    val name = "main.db"
    val version = 1
    var data = mutableListOf<String>()
    fun insertData(str: String){
        data.add(str)
    }

}