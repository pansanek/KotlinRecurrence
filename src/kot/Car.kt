package kot

class Car(override var name: String = "car"):Transport(name) {
    override fun drive() {
        println("Car is moving")
    }

    fun startEngine(): Boolean {
        println("Bike is moving")
        return true
    }
}