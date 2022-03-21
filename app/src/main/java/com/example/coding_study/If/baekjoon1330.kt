package com.example.coding_study.baekjoonIf

//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.

//공백을 받아오기 위해 scanner 사용
import java.util.Scanner
fun main() {
    val sc:Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    if(a > b) print(">")
    else if(a < b) print("<")
    else print("==")
}




//fun main(){
//    val (a,b) = readLine()!!.split(' ')
//
//    if (a > b){
//        print(">")
//    }else if ( a < b){
//        print("<")
//    }else if (a == b){
//        print("==")
//    }
//}