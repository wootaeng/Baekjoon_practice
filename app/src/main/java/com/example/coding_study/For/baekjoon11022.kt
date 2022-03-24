package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


/*
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */

//fun main(){
//    val sc = Scanner(System.`in`)
//    for (i in 1..sc.nextInt()){
//        val a = sc.nextInt()
//        val b = sc.nextInt()
//
//        println("Case #$i: $a+$b = ${a+b}\n")
//    }
//
//}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..br.readLine().toInt()){
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        bw.write("Case #$i: $a+$b = ${a+b}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//
//    for (i in 1..readLine().toInt()){
//        StringTokenizer(readLine()).run {
//            val a = nextToken().toInt()
//            val b = nextToken().toInt()
//
//            writer.write("Case #$i = $a + $b = ${a+b}\n")
//        }
//    }
//    writer.flush()
//    writer.close()
//    close()
//}