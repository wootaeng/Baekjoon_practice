package com.example.coding_study.baekjoonIf

import java.util.*

/*
    윤년 판별 문제
    첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
    첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
    윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 */

fun main(){
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()

    println(
        if (year % 4 == 0){
           if (year % 100 != 0 || year % 400 ==0){
               '1'
           }else{
               '0'
           }
        }else{
            '0'
        }
    )

}