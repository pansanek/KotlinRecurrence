package kot

class Cat(val name:String, val age:Int, val weight: Float = 0f) {

    val isOld: Boolean
    get() = age>=12
    fun printInfo(){
        println("Name: $name, Age $age, Weight $weight")
    }

}