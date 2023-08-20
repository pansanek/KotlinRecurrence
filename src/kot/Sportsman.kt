package kot

class Sportsman {
    fun invokeWaterBoy(waterBoy: WaterBoy){
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater:() -> Unit){
        bringWater()
    }
}