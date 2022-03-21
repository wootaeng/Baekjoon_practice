package com.example.coding_study

import java.util.*


//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
fun main() = with(Scanner(System.`in`)){

    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    println((a+b)%c)
    println(((a%c) + (b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}

fun main2() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println((a+b)%c)
    println(((a%c) + (b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}