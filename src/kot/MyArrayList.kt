package kot

import java.lang.Exception
import java.util.*

class MyArrayList<T>: MyList<T> {

    var array = arrayOfNulls<Any>(10)
    var size = 0
    override fun get(index: Int): T {
        if (index in 0 until size){
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if(size>=array.size){
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun delete(element: T) {
        for((index,string) in array.withIndex()){
            if (string == element){
                deleteAt(index)
                return
            }
        }
    }

    override fun deleteAt(index: Int) {
        if(index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else throw IndexOutOfBoundsException()
    }

    override fun size(): Int {
        return size
    }
}