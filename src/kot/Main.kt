package kot

import kot.Month.*
import kot.Season.*
fun main(args: Array<String>) {
    val month = APRIL
    val season = when(month){
        DECEMBER,JANUARY,FEBRUARY -> WINTER
        MARCH,APRIL,MAY -> SPRING
        JUNE,JULY,AUGUST -> SUMMER
        SEPTEMBER,OCTOBER,NOVEMBER -> AUTUMN
    }
    println(season)
    println(month.tempAvarage)
}

