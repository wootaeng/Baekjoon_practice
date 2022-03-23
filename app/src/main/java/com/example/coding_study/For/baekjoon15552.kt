package com.example.coding_study.For

import java.io.*
import java.util.*

/*
    Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
    BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
    빠른 A+B
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat (br.readLine().toInt()){
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        bw.write("${a+b}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}

//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    for (i in 1..br.readLine().toInt()){
//        val token = StringTokenizer(br.readLine())
//        val a = token.nextToken().toInt()
//        val b = token.nextToken().toInt()
//        bw.write("${a+b}\n")
//    }
//    bw.flush()
//    bw.close()
//    br.close()
//}

//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
//
//    for (i in 1..br.readLine().toInt()){
//        val token = StringTokenizer(br.readLine())
//        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
//        bw.write(sum +"\n")
//    }
//    bw.flush()
//    bw.close()
//    br.close()
//}