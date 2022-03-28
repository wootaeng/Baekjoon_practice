package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var number = br.readLine().toInt()
    var num = number
    var sum:Int //각자리 합
    var cnt = 0 //싸이클

    //각 자리수 구하기 num/10 + num%10
    do {
        sum = num/10 + num%10
        num = num%10*10 + sum%10
        cnt++
    }while (number != num)

    bw.write("$cnt")
    bw.flush()
    bw.close()
    br.close()
}