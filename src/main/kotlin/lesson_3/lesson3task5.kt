package org.example.lesson_3

fun main(){

    val stringMovie = "D2-D4;0"

    val movieList:List<String> = stringMovie.split("-",";")

    println("Откуда: ${movieList[0]}")
    println("Куда: ${movieList[1]}")
    println("Номер хода: ${movieList[2]}")

}