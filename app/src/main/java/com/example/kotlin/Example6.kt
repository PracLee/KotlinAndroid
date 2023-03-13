package com.example.kotlin

/**
 * Java 와의 가장 큰 차이점은
 * Kotlin 의 컬렉션에는
 * 변경  가능한 컬렉션 mutable
 * 변경 불가능한 컬렉션 immutable
 * 으로 나누어져 있다.
 * for문보다는 내장함수를 더 많이 사용한다.
 */
fun main(){
    val list = mutableListOf(1,2,3,4)
    list.add(5)
    list.addAll(listOf(6,7,8,9,))

    val list1 = listOf(1,2,3,4)

    val diverseList = listOf(1 , "Hi", 1.234, true)

    println(list.map { it * 10 }.joinToString("/"))

    /**
     * joinToString
     * list를 분리해서 보여줌
     */
    println(list.joinToString(","))

    val map = mapOf((1 to "Hi"), (2  to "bye"))

    val map1 = mutableMapOf((1 to "Hi"), (2  to "bye"))
    map1.put(3, "Good Night")
    map1[4] = "Gonnichiwa!"
}