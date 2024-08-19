package org.example.lesson_2

fun main(){
    val startHour = 9
    val startMinutes = 39
    val pathTime = 457
    val minutesInHour = 60

    var finishHour = startHour + (pathTime / minutesInHour)
    var finishMinutes = startMinutes + (pathTime % minutesInHour)

    if(finishMinutes > minutesInHour) {
        finishMinutes -= minutesInHour
        finishHour += 1
        println("$finishHour:$finishMinutes")

    }

}