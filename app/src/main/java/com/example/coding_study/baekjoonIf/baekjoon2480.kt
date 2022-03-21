package com.example.coding_study.baekjoonIf



/*
    같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
    첫째 줄에 게임의 상금을 출력 한다.

    입력 : 3 3 6 출력 : 1300
 */

import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()

    if (a == b && b ==c && a==c){
        val money = 10000 + (a * 1000)
        print(money)
    } else if (a == b ){
        val money = 1000 + (a*100)
        print(money)
    } else if (b == c){
        val money = 1000 + (b*100)
        print(money)
    } else if (a==c){
        val money = 1000 + (c*100)
        print(money)
    } else {
        var arr: Array<Int> = arrayOf(a,b,c)
        var money = arr[0]
        for (i in 0 until arr.size){
            if (money < arr[i]){
                money = arr[i]
            }
        }
        money = money *100
        print(money)
    }
}