package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*
    자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오
 */
//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//
//    val n = br.readLine().toInt()
//    for (i in 1..n){
//        println(i)
//    }
//
//    br.close()
//
//}

//fun main(){
//    val sc = Scanner(System.`in`)
//
//    val n = sc.nextInt()
//    for (i in 1..n){
//        println(i)
//    }
//}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..br.readLine().toInt()){
        bw.write("${i}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}