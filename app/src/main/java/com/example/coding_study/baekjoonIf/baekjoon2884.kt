package com.example.coding_study.baekjoonIf

/*
    첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은
    현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
    입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고,
    끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

    입력 : 10 10 // 출력 : 9 25
 */


import java.time.LocalTime
import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()

    if (m < 45){
        if (h == 0) {
            h = 23
            m += 60
        } else {
            h -= 1
            m += 60
        }
    }

    print("${h} ${m-45}" )

}


