package org.example.lesson_2

fun main(){
    val employee = 50
    val employeeSalary = 50000
    val intern = 30
    val internSalary = 20000

    val allSalaryEmpoyee = employee * employeeSalary
    val allSalary = allSalaryEmpoyee + (internSalary*intern)
    val averageSalary = allSalary/(employee+intern)

    println(allSalaryEmpoyee)
    println(allSalary)
    println(averageSalary)

}