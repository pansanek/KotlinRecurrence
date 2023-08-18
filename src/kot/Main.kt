package kot


//fun main(args: Array<String>) {
//    val student1 = Student("Ivan","Ivanov","123")
//    val student2 = student1.copy(id="1234")
//    val (name,lastname,id) = student1
//    println(student1)
//    println(student2)
//    println(student1.hashCode())
//    println(student2.hashCode())
//    println(student1 == student2)
//    println(student1 === student2)
//}

fun main() {

    val address = Address("city", "street", 1)
    val address2 = address.copy()

    println(address)
    println(address2)
    println(address.hashCode())
    println(address2.hashCode())
    println(address == address2)

    val (city, street, number) = address
}