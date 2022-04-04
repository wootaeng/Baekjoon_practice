package com.example.coding_study.Array

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

/*
    자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
    첫째 줄에 시험 본 과목 수
    두번째 줄에 점수  / 출력은 평균값
 */

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val scoreAll = StringTokenizer(br.readLine())
    var arr = IntArray(n)
    var m = 0
    var sum = 0.00

    for (i in 1..n) {
        var score = scoreAll.nextToken().toInt()
        m = max(m, score)
        arr[i-1] = score
    }

    for (i in arr) {
        sum += 100.00*i/m
    }

    println(sum/n)
    br.close()


}