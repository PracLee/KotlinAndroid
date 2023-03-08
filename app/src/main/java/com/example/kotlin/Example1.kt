package com.example.kotlin

fun main(){
    val result = test(1, c = 6)
    println(result)
    test2(id = "mrgoga", nickname = "Lee", name = "BJ")
    println(times(4,5))
}

// 1. 함수
/*
fun name(param: type, param : type = 3...) : Unit(return){
    body
}
오버로딩이 필요없고, 디폴트 값을 선언 함으로 오버로딩을 줄일 수 있다.
함수 사용시, 파라미터 명을 명시해 줌으로써, 함수 변수명 순서를 맞추지 않고 사용할 수 있다.
한줄 짜리 return 은 =으로 표현 할 수 있다. (Single Expression)
실사용시 파라미터가 늘어날 수 있는 경우를 대비하기 위해 마지막 파라미터 뒤에 , 사용할 수 있다.
*/
fun test(a : Int , b : Int = 3, c : Int = 4): Int {
    println(a + b)
    return a + b
}

fun test2(name : String, nickname : String, id : String,) = println(name + nickname + id)

fun times (a : Int, b : Int) = a * b