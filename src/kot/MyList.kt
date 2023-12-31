package kot

interface MyList<T> {
    fun get(index: Int): T
    fun add(string: T)
    fun delete(element: T)
    fun deleteAt(index: Int)
    fun size(): Int
}