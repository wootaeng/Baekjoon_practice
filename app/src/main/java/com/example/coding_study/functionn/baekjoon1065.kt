package com.example.coding_study.functionn

import java.util.*

/*
    어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
    N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */

fun main(){
    val sc = Scanner(System.`in`)
    val num: Int = sc.nextInt()
    val temp = IntArray(3)

    var count = 0
    for (i in 1..num) {
        if (i < 100) count++ else {
            val a = i / 100
            val b = i % 100 / 10
            val c = i % 100 % 10
            if (a - b == b - c) count++
        }
    }
    println(count)
}