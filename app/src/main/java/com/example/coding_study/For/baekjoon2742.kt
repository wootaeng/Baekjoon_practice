package com.example.coding_study.For


/*
    자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    기찍 N 거꾸로
 */
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in br.readLine().toInt() downTo 1){
        bw.write("${i}\n")
    }
    bw.flush()
    bw.close()
    br.close()

}

