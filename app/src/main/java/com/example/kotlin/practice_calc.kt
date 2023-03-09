package com.example.kotlin

fun main(){
    var alpha = 0
    val beta = 2
    println(add(alpha, beta))
    println(minus(alpha, beta))
    println(dviede(a = alpha, beta))
    println(times_(3))
}

fun add(a : Int, b : Int = 1) : Int{
    println("Run Add")
    return a + b
}

fun minus (a: Int, b : Int = 1) = (a - b)

fun dviede (a : Int, b : Int = 2) = (a / b)

fun times_ (a : Int , b : Int = 2) : Int = (a * b)