package com.example.kotlin

import com.example.kotlin.Book.Companion.PAGE

// Object, Companion object
/**
 * Object : 클래스를 정의 함과 동시에 객체를 생성
 * 싱글톤을 쉽게 만들 수 있는 키워드
 * 생성자 사용 불가
 * 프로퍼티, 메소드, 초기화 블록은 사용 가능
 * 다른 클래스나, 인터페이스를 상속받을 수 있음
 * -> 에러코드를 찾을 때 주로 사용
 *
 * Companion Object : 동반객체
 * Java의 static과 동일한 역할
 * 클래스내에 생성 할 수 있음
 */
fun main(){
    // 선언과 동시에 객체 생성 : 초기화 실행
    Counter
    println(Counter.cnt)
    Counter.up()
    println(Counter.cnt)
    Counter.up()
    println(Counter.cnt)
    Counter.sayHello()
    println("Book.page : " + Book.PAGE)
    Book.write()
    PAGE
}
// 생성자 사용이 불가능, 상속 가능!
object Counter : Hi() {
    init {
        println("initialized")
    }
    var cnt = 0
    fun up(){
        println("cnt++")
        cnt++
    }
}

open class Hi() {
    fun sayHello() = println("hello")
}

class Book{
    // static 과 같이 사용 : 클래스당 하나만 생성 가능
    companion object {
        const val PAGE = 200
        fun write() = Book()
    }
}