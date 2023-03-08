package com.example.kotlin

fun main(){
    val user = User("Lee")
    println(user.name)
    Kid("BJ", 30,"female")
}
// 기본적으로 클래스 상속을 권장하지 않으므로,
// open prefix 를 사용하여 상속 가능(변수도)
open class User(open val name : String, open var age : Int = 30)

// 기초생성자 constructor 가 생략되어 있음
class Kid(override val name: String, override var age: Int) : User(name, age){
    var gender : String = "male"

    // 생성자 수행 전 최초 수행하는 동작 정의
    init{
        println("최초 수행")
    }
    // 부생성자
    constructor(name: String, age: Int, gender: String) : this(name, age){
        this.gender = gender
        println("부 생성자 호출")
    }
}