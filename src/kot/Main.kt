package kot


fun main(args: Array<String>) {
//    travel(object :Transport("Bus"){
//        override fun drive() {
//            println("Bus is moving")
//        }
//
//    })


    val sportsman = Sportsman()
    sportsman.invokeWaterBoy(object :WaterBoy{
        override fun bringWater() {
            println("Water")
        }

    })
}



fun travel(transport: Transport){
    transport.drive()
}
