package com.example.coding_study.For

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*
    X보다 작은 수
    X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
    10 5                    1 4 2 3
    1 10 4 9 2 3 8 5 7 6
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())

    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt()
    for(i in 1 .. n){
        val a = st2.nextToken().toInt()
        if( x > a)
            bw.write("$a ")
    }
    bw.flush()
    bw.close()
    br.close()
}