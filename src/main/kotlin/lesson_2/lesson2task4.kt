package org.example.lesson_2

import kotlin.math.roundToInt

fun main(){

    val buf = 0.2
    val crystalOre = 7
    val metalOre = 11
    val resultCrystalOre = crystalOre * buf
    val resultMetalOre = metalOre * buf

    println("crystalOre: $crystalOre")
    println("BONUS crystalOre: "+ resultCrystalOre.roundToInt())
    println("crystalOre: $metalOre")
    println("BONUS crystalOre: "+ resultMetalOre.roundToInt())

}