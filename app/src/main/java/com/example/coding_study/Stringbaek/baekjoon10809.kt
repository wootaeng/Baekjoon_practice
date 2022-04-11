package com.example.coding_study.Stringbaek


/*
    각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
    만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
    알파벳이 없음 -1 있으면 문자열에 위치

 */
fun main(){
    val word = readLine()!!.toString() //입력한 문자
    var ABC = MutableList(26, { -1 })
    var count = 0

    for (i in word){
        if (ABC[i-'a']!= -1){ // -'a' 알파벳 구하는 방법
            count++     //없으면 -1 숫자 ++ 계속 진행
            continue
        } else {
            ABC[i -'a'] = count
        }
        count++
    }

    for (i in 0 until 26){
        print("${ABC[i]} ")
    }

}




//fun main() {
//    val str = readLine()!!.toString()
//    var arr = MutableList(26,{-1})
//    var count = 0
//    for (i in str){
//        if(arr[i-'a']!=-1) {
//            count++
//            continue
//        }
//        else {
//            arr[i - 'a'] = count
//        }
//        count++
//    }
//    for(i in 0 until 26){
//        print("${arr[i]} ")
//    }
//}
