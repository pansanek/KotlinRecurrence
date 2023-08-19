package kot

class Programmer( name: String, age: Int,val language:String): Worker(name,age) {
    override fun work() {
        println("Writing code on $language")
    }
}