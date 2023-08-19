package kot

import java.util.*

class Dog(weight: Float) :Animal("Dog",weight,"Land") {
    override fun eat(){
        println("Eating a bone")
    }

}