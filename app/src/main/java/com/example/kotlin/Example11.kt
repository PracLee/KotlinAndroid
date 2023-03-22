package com.example.kotlin
// 확장 함 Extension Function
// 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
fun main(){
    val test = Test()
    test.hello()
    test.hi()
}

// 커스텀을 위한 함수 사용 안해도 됨
// 클래스 자체에 함수를 강제 주입
fun Test.hi() = print("Hi~");

class Test(){
    fun hello() = print("hello");
    fun bye() = print("bye");
}