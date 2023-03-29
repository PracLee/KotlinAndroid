package com.example.kotlin

// 나중에 초기화 될 수 있는 변수 : 초기화 지연 : variable에만 선언 가능, 변수 타입 필수로 지정해야함!
// 기본형 변수에는 쓸수 없고 선언 후 나중에 값 전달 가능
lateinit var text : String
lateinit var age : Integer

// 값을 호출하는 즉시 초기화, 사용하지 않으면, 초기화 하지 않음
val test : Int by lazy {
    println("initial")
    31
}

fun main() {
    text = "name"
    println(text)
    println("init1 : $test")
    println("init2 : $test")
}