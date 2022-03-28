package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/*
    별찍기 우측정렬
         *
        **
       ***
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    for (i in 1..n){
        for (j in n downTo 1){
            bw.write(if ( i >= j)"*" else " ")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
    br.close()
}