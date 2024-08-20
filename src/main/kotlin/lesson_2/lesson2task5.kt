package org.example.lesson_2

fun main(){

    val startSum = 70000
    val persentInYear = 16.7
    val depositTerm = 20
    val divider = 100

    val result = startSum * Math.pow(1 + persentInYear / divider, depositTerm.toDouble())

    println(String.format("%.3f",result))

}