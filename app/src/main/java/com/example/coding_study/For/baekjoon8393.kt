package com.example.coding_study.For

import java.util.*

/*
    n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()

    var sum = 0
    for (i in 1..a){
        sum += i
    }

    print(sum)
}