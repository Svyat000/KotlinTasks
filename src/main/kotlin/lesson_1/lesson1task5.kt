package org.example.lesson_1

fun main(){

    val secondInHour = 60
    val minutesInHour = 60
    val seconds = 6480

    val secondFinish = seconds % secondInHour
    val minutes = (seconds / secondInHour) % secondInHour
    val hour = seconds / secondInHour / minutesInHour
    println("$hour:$minutes:$secondFinish")



}