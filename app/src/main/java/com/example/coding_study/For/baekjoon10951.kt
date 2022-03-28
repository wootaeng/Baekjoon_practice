package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*
    A+B  EOF 사용
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var st:String ?
    while (readLine().also { st = it} != null  ){
        val token = StringTokenizer(st)
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        bw.write("${a+b}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}