package org.example.lesson_1

fun main(){

    val seconds = 7651273

    val secondFinish = seconds%60
    val minutes = (seconds/60)%60
    val hour = seconds/60/60

    print(hour)
    print(":"+minutes )
    print(":"+secondFinish )

}