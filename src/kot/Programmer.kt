package kot

class Programmer( name: String, age: Int,val language:String): Worker(name,age),Cleaner {
    override fun work() {
        println("Writing code on $language")
    }

    override fun clean() {
        println("Programmer is cleaning")
    }
}