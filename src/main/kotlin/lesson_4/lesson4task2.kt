package org.example.lesson_4

fun main(){

    val minWeight = 35
    val maxWeight = 100
    val maxLiters = 100

    val checkWeight1 = 20
    val checkLiters1 = 80

    val checkWeight2 = 50
    val checkLiters2 = 100

    println("Average: ${(checkWeight1 > minWeight &&  checkWeight1<=maxWeight) && checkLiters1 < maxLiters}")
    println("Average: ${(checkWeight2 > minWeight &&  checkWeight2<=maxWeight) && checkLiters2 < maxLiters}")

}