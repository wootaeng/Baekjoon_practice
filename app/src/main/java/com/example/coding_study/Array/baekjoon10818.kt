package com.example.coding_study.Array

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()
    val str = br.readLine()

    val arr = str.split(' ')
    var minNum = arr[0].toInt()
    var maxNum = arr[0].toInt()
    for (i in arr) {
        var num = i.toInt()
        minNum = min(minNum, num)
        maxNum = max(maxNum, num)
    }

    println("$minNum $maxNum")
    br.close()


}



//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    val size = br.readLine().toInt()
//
//    var arr = arrayListOf<Int>(size)
//
//    for (i in 0 until size){
//        val token = StringTokenizer(readLine())
//        arr[i] = token.nextToken().toInt()
//
//    }
//    bw.write("${arr.minOrNull()}  ${arr.maxOrNull()}")
//    bw.flush()
//    bw.close()
//    br.close()
//}