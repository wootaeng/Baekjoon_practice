package com.example.coding_study.baekjoonIf

import java.util.*

//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다

//fun main(){
//    val sc = Scanner(System.`in`)
//    val a = sc.nextInt()
//
//    if (a >= 90){
//        print("A")
//    } else if (a >= 80){
//        print("B")
//    } else if (a >= 70){
//        print("C")
//    } else if (a >= 60){
//        print("D")
//    } else {
//        print("F")
//    }
//
//}

fun main(){
    val sc = Scanner(System.`in`)
    val grade = sc.nextInt()

    print(
        when {
            grade >= 90 -> "A"
            grade >= 80 -> "B"
            grade >= 70 -> "C"
            grade >= 60 -> "D"
            else -> "F"
        }
    )
}
