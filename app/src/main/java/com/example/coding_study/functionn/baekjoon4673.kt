package com.example.coding_study.functionn

/*
    10000 >= n 값을 순서대로 출력하는 함수
    n, d(n), d(d(n)), d(d(d(n)))
 */
fun main(){
//    val max = 10000 //최대값 설정
//    var a = IntArray(max) //배열에 담기
    var a = emptyList<Int>() //빈 list
    var num = 1 //초기값
    for (i in 1..10000) {
        num = (i + (i / 1000) + ((i / 100)%10) + ((i % 100)/10) + (i % 10))
        a += num
    }

    for (i in 1..10000) {
        if (i in a ) {
        }
        else {println(i)}
    }

}