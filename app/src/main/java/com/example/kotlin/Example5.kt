package com.example.kotlin

/**
 * 반복문
 * 표현식이 다름
 */
fun main() {
    println()
    println("for문 1")
    for(i in 1 .. 10){
        print(i)
        print(", ")
    }
    println()
    println("for문 2")
    for(i in IntRange(1, 10)){
        print(i)
        print(", ")
    }
    println()
    println("미만")
    for(i in 1 until 10){
        print(i)
        print(", ")
    }
    println()
    println("step 조건만큼 뛰는 수")
    for(i in 1 .. 10 step (2)){
        print(i)
        print(", ")
    }
    println()
    println("작아지는 숫자")
    for (i in 10 downTo 1){
        print(i)
        print(", ")
    }

    println()
    println("while문")
    var c = 1
    while (c < 11){
        print(c)
        print(", ")
        c++
    }

}