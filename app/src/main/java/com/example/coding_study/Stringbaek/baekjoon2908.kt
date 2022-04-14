package com.example.coding_study.Stringbaek

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

/*
    입력한 숫자를 역순 후 비교 하여 큰수 출력
 */

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val rs = StringTokenizer(br.readLine())
    val A = rs.nextToken()
    val B = rs.nextToken()

    println(max(A.reversed().toInt(), B.reversed().toInt())) //컬렉션 reversed 역순으로 돌리는 함수

    br.close()

}