package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/*
    별찍기
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..br.readLine().toInt()){
        for (j in 1..i){
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
    br.close()
}