package com.example.coding_study.input_fouroperation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

//a*b

fun main(args: Array<String>) {
    val BR = BufferedReader(InputStreamReader(System.`in`))
    val A = StringTokenizer(BR.readLine())
    println(Integer.parseInt(A.nextToken()) * Integer.parseInt(A.nextToken()))
    BR.close()
}

//fun main(){
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//
//    print(a*b)
//}