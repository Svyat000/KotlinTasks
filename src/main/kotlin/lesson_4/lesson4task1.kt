package org.example.lesson_4

fun main(){

   val allTable = 13
   val reserveTableToday = 13
   val freeTableTomorrow = 4
   val reserveTableTomorrow = allTable - freeTableTomorrow

   println("Доступность столиков на сегодня: ${allTable > reserveTableToday}")
   println("Доступность столиков на завтра: ${allTable > reserveTableTomorrow}")

}