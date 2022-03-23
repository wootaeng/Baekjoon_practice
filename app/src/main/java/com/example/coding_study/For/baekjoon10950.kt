package com.example.coding_study.For

import java.util.*

/*
    A+B 더하기
 */

fun main(){
    val sc = Scanner(System.`in`)

    var T = sc.nextInt()
    for (i in 1..T){
        var a = sc.nextInt()
        var b = sc.nextInt()

        println(a + b)
    }
}
