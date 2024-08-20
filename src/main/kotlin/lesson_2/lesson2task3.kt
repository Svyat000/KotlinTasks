package org.example.lesson_2

fun main(){
    val startHour = 9
    val startMinutes = 39
    val pathTimeInMinutes = 457
    val minutesInHour = 60
    val generalStartMinutes = (startHour * minutesInHour) + startMinutes


    val finishHour = (generalStartMinutes + pathTimeInMinutes) / minutesInHour
    val finishMinutes = (generalStartMinutes + pathTimeInMinutes) % minutesInHour

    println("%02d:%02d".format(finishHour,finishMinutes))

}