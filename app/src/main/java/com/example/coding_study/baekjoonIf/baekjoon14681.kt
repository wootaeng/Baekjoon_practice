package com.example.coding_study.baekjoonIf

/*
    첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
    점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
    사분면 문제
 */

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()


    print(
        if (a > 0 && b > 0){
            '1'
        }else if (a < 0 && b > 0){
            '2'
        }else if (a < 0 && b < 0 ){
            '3'
        }else{
            '4'
        }
    )
}