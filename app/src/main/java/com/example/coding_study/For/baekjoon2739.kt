package com.example.coding_study.For

import java.util.*

/*
    구구단
 */
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()

    for (i in 1..9){
        println("${a} * ${i} = ${a*i}" )
    }
}