package com.example.coding_study

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val BR = BufferedReader(InputStreamReader(System.`in`))
    val A = StringTokenizer(BR.readLine())
    println(Integer.parseInt(A.nextToken()) - Integer.parseInt(A.nextToken()))
    BR.close()
}


