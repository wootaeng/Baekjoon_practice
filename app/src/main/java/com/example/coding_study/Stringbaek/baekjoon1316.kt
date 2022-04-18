package com.example.coding_study.Stringbaek

import java.util.*

/*
    그룹단어 체커
    입력한 케이스 체크, 순서대로 나와야함, 나왔던 문자가 나오면 안됨. 반복은 가능 그런 문자가 몇개인지 출력
 */
//알파벳의 연속성 체크를 위해 boolean 체크
//현재값 과 이전값 을 비교 같지않으면 반복문 종료

fun main(){
    val sc = Scanner(System.`in`)
    var r = sc.nextLine().toInt() //테스트 횟수
    var result = 0 //그룹 체커 갯수 초기값


    repeat(r){
        val str = sc.nextLine() //입력한 단어
        val check = BooleanArray(26) //알파벳을 연속성 체크와 담기위한 BooleanArray

        var isCheck = false //초기값 false

        for(i in str.indices) { //index 의 범위를 리턴하기 위해 indices
            if(!check[str[i]-'a']) {
                // 특정 원소 - 'a' 에 false라면 (e.g) check['b'-'a'] = check[1]
                check[str[i] - 'a'] = true
            } else {
                if(str[i] != str[i-1]) {
                    // check 가 true 일 때,
                    // 이전 원소와 같지 않다면 이미 이전 원소 전에 등장했으므로 연속이 아님
                    isCheck = true
                    break
                }
            }
        }
        if(!isCheck) result++
    }
    println(result)

}