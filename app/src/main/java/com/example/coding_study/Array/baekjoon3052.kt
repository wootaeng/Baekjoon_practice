package com.example.coding_study.Array

import java.util.*

/*
    첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */

fun main(){
    val sc = Scanner(System.`in`)

    var arr = mutableSetOf<Int>() //mutableSetOf 공부

    repeat(10){
        arr.add(sc.nextInt().toInt() % 42)
    }
    print(arr.size)
}