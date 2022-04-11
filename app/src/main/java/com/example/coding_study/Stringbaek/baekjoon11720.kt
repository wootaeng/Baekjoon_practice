package com.example.coding_study.Stringbaek

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val length = br.readLine().toInt()
    val n = br.readLine()
    var sum = 0

    for (i in 0..length-1) {
        sum += n[i].toString().toInt()
    }

    println(sum)
    br.close()
}