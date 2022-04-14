package com.example.coding_study.Stringbaek

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/*
    단어 갯수 출력하는 문제
 */
fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextLine() //입력한 문자

    if(n.isEmpty() || n.equals(" ")){ //문자가 없거나 " " 일경우
        print(0)
    }else { // " " 공백을 리스트에 담아서 size 출력
        val word : List<String> = n.trim().split(" ") //trim() 문자열 양끝 공백제거 사용하면 통과
//        val word : List<String> = n.split(" ") //출력은 되나 답이 틀림
        print(word.size)
    }

}

//fun main() {
//
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val rs = StringTokenizer(br.readLine()) //StringTokenizer 를 사용하면 문자열로 잘라준다
//    println(rs.countTokens()) //전체 토큰 수를 반환한다.
//    br.close()
//
//}