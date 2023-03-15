package com.example.kotlin

/**
 * lambda
 * 함수형 언어의 특징
 * 1. 익명함수
 * 2. 변수처럼 사용되어 함수의 argument, return 에 사용 가능
 * 3. 한 번 사용되고, 재사용되지 않는 함수
 * 함수 구현부의 마지막 줄이 return 값
 * 함수 구현부에 입력값 선언 가능
 */
fun main(){
    val a = fun(){
        println("In lambda")
    }
    // 변수   입력값 들      return 값
    val b : (Int) -> Int = {
        it * 10
    }
    println(b(10))
    val d = { i :Int, j : Int -> i * j}
    // 변수 생략 가능 _
    val f : (Int, String, Boolean) -> String = {_, b, _ -> b}
    hello(10, b)
}

fun hello(a:Int, b : (Int) -> Int) : (Int) -> Int{
    println(a)
    println(b(20))
    return b
}