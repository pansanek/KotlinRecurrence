package kot

open class Animal(val name:String,var weight:Float,val habitat:String) {
    open fun eat(){
        println("Eat")
    }
    open fun run(){
        println("Run")
    }
}