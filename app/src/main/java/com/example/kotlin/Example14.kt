package com.example.kotlin

// Data, Sealed class
/**
 * Data class : 데이터를 담기 위한 클래스
 * toString() hashCode() equals() copy() 메소드를 자동으로 생성
 * 1개 이상의 프로퍼티가 존재해야함
 * 데이터 클래스는 abstract open sealed, inner 를 붙일 수 없음
 * 상속이 불가능
 */
/**
 * Sealed class : 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
 * 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
 * when과 함께 쓰일 때, 강점 (명시성 확보)
 */

fun main(){
    val person = Person("BJ", 31)
    val dog = Dog("seven", 5)
    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 7))
    println(dog.toString())
    val cat : Cat = BlueCat()
    val result = when(cat){
        is BlackCat -> "black"
        is BlueCat -> "blue"
        is RedCat -> "red"
    }

}

class Person(
    val name:String,
    val age : Int,
)
// 반드시 하나 이상의 속성이 필요
data class Dog(
    val name : String,
    val age:Int,
){
    override fun toString(): String {
        return "직접 구현 $name : $age"
    }
}

sealed class Cat()
class RedCat() : Cat()
class BlueCat() : Cat()
class BlackCat() : Cat()
