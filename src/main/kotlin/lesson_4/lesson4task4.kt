package org.example.lesson_4

fun main(){

    val trainingDay = 1
    val exerciseHand: Boolean
    val exerciseAb: Boolean
    val exerciseLeg: Boolean
    val exerciseBack: Boolean

    if(trainingDay%2==0){

        exerciseHand = false
        exerciseAb = false
        exerciseLeg = true
        exerciseBack = true

        println("Упражнения для рук: $exerciseHand")
        println("Упражнения для пресса $exerciseAb")
        println("Упражнения для ног: $exerciseLeg")
        println("Упражнения для спины: $exerciseBack")

    } else if(trainingDay%2==1){

        exerciseHand = true
        exerciseAb = true
        exerciseLeg = false
        exerciseBack = false

        println("Упражнения для рук: $exerciseHand")
        println("Упражнения для пресса $exerciseAb")
        println("Упражнения для ног: $exerciseLeg")
        println("Упражнения для спины: $exerciseBack")

    }

}