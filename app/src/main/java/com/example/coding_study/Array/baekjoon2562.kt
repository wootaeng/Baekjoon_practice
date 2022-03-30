package com.example.coding_study.Array

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.random.Random.Default.nextInt


fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val maxArray = arrayListOf<Int>()
    var maxLine = 0
    var maxNum = 0

    for (i in 0 until 9) {
        val inputNum = nextInt()
        maxArray.add(inputNum)

        if (maxNum < maxArray[i]) {
            maxNum = maxArray[i]
            maxLine = i
        }
    }

    println("$maxNum\n${maxLine + 1}")
}



//fun main(){
//    val br = BufferedReader(InputStreamReader(System.`in`))
//
//    var maxNum = 0
//    var index = 0
//
//    for (i in 1..9){
//        var num = br.readLine().toInt()
//        if (maxNum<num){
//            maxNum = num
//            index = i
//        }
//    }
//    println("$maxNum\n$index")
//    br.close()
//}