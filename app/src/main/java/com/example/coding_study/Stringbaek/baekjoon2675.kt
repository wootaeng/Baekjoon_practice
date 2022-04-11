package com.example.coding_study.Stringbaek

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/*
    입력 테스트 횟수(반복) 입력한 문자열
    출력 반복횟수만큼 문자를 반복출력
 */

fun main(){
    val sc = Scanner(System.`in`)

    val t = sc.nextInt()
//    var result = ""

    repeat(t){
        val str = sc.next().split(" ")
        var result = ""

//        val str = sc.next()
        for (char in str) {
            repeat(t) {
                result += char
            }
        }
        print(result)
    }



}

fun main() = with(Scanner(System.`in`)){
    val wSize = readLine()!!.toInt()

    for (i in 0..wSize-1) {
        var word = readLine()!!.split(" ")
        var count = word[0].toInt()
        var wordArr = word[1].toCharArray()

        for (wA in wordArr) {
            for (w in 0..count-1) {
                print(wA)
            }
        }
        println()
    }
}


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val T = br.readLine().toInt()
    for (k in 1..T) {

        val rs = StringTokenizer(br.readLine())
        val R = rs.nextToken().toInt()
        val S = rs.nextToken()
        var P = ""

        for (i in 0..S.length-1) {
            for (j in 1..R) {
                P += S[i]
            }
        }

        println(P)

    }

    br.close()
}
