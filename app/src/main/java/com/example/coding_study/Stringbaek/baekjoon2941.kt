package com.example.coding_study.Stringbaek

import java.util.*

/*
    입력한 단어가 몇개의 크로아티아 언어로 되어있는가
 */
fun main(){
    val sc = Scanner(System.`in`)
    var r = sc.nextLine() //입력값
    val arr = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=") //array 에 크로아티어 언어 담기

    for (i in arr){
        r = r.replace(i,"a") //입력값을 arr 만큼 반복을 돌려서 나온단어를 "a" 로 변경(replace)
    }

    print(r.length) //"a"로 변경된 값의 길이
}