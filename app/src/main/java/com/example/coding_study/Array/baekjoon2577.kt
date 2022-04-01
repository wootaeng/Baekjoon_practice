package com.example.coding_study.Array

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/*
    A,B,C 를 곱하여 나온 수의 0 - 9  까지 숫자가 몇번씩 나왔는지 출력하는 문제
    예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
    계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val A = br.readLine().toInt()
    val B = br.readLine().toInt()
    val C = br.readLine().toInt()

    val multi = (A*B*C).toString()

    var cnt0 = 0
    var cnt1 = 0
    var cnt2 = 0
    var cnt3 = 0
    var cnt4 = 0
    var cnt5 = 0
    var cnt6 = 0
    var cnt7 = 0
    var cnt8 = 0
    var cnt9 = 0

    for (i in 0..multi.length-1) {
        when (multi[i]) {
            '0' -> {cnt0++}
            '1' -> {cnt1++}
            '2' -> {cnt2++}
            '3' -> {cnt3++}
            '4' -> {cnt4++}
            '5' -> {cnt5++}
            '6' -> {cnt6++}
            '7' -> {cnt7++}
            '8' -> {cnt8++}
            '9' -> {cnt9++}
        }
    }

    println("$cnt0\n$cnt1\n$cnt2\n$cnt3\n$cnt4\n$cnt5\n$cnt6\n$cnt7\n$cnt8\n$cnt9")
    br.close()
}


