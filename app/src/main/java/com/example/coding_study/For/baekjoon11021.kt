package com.example.coding_study.For

import java.util.*
import java.io.*

/*
    각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    Case #x: a+b
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..br.readLine().toInt()){
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        bw.write("Case #$i: ${a+b}\n")

    }

    bw.flush()
    bw.close()
    br.close()
}