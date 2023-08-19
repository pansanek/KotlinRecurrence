package kot

import java.text.FieldPosition
import java.util.*

open class Worker(val name: String, val age: Int) {
    open fun work(){
        println("Working")
    }

}