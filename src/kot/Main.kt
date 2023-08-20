package kot


fun main(args: Array<String>) {
    val car: Transport = Car()
    val bike: Transport = Bike()
    if (car is Car && car.startEngine())

}


