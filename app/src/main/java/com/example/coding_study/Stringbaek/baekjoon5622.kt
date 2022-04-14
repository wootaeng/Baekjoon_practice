package com.example.coding_study.Stringbaek

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()
    var sum = 0

    for (element in n){ //i in 0..n.length -1  //요소로 바꿔도 적용이 되나봄. 코틀린이 바꿔줌
        when(element){ //n[i]
            'A','B','C' -> sum += 3
            'D','E','F' -> sum += 4
            'G','H','I' -> sum += 5
            'J','K','L' -> sum += 6
            'M','N','O' -> sum += 7
            'P','Q','R','S' -> sum += 8
            'T','U','V' -> sum += 9
            'W','X','Y','Z' -> sum += 10
        }
    }
    println(sum)
    br.close()
}