package org.example.lesson_4

fun main(){

    val solarWeather = true
    val tentIsOpen = true
    val humidity = 20
    val timeOfYear = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(solarWeather == true) && (tentIsOpen == true) && (humidity == 20) && (!timeOfYear.equals("Зима")) }")



}