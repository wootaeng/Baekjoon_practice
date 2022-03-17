package com.example.coding_study

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var a = nextInt()
    var b = next()


    // 문자는 문자열이 모인 배열이기에 인덱싱[] 을 사용 ,
    // - '0' 을 하는 이유는 아스키코드값이문자열이 반환 되기에 그대로 보여지기 위해 - '0' 을 해주는 것

    println(a * (b[2] - '0'))
    println(a * (b[1] - '0'))
    println(a * (b[0] - '0'))
    println(a * b.toInt())
}