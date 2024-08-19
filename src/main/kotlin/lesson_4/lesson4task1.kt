package org.example.lesson_4

fun main(){

   val allTable = 13
   val reservTableToday = 13
   val freeTableTomorrow = 4
   val reservTableTomorrow = allTable - freeTableTomorrow

   println("Доступность столиков на сегодня: ${allTable > reservTableToday}")
   println("Доступность столиков на завтра: ${allTable > reservTableTomorrow}")

}