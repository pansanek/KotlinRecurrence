package kot

class MyRandom {
    companion object{
        const val MONDAY = "Monday"
        fun randomInt(from: Int, to:Int) = (Math.random() * (to - from +1)).toInt() + from
        fun randomBoolean() = randomInt(0,1)>0
        fun randomDayOfWeek(): String {
            val index = randomInt(1,7)
            return when (index){
                1-> MONDAY
                else -> "Not Found"
            }
        }
    }
}