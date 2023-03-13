package com.example.kotlin

/**
 * null
 * Kotlin 에서는 compile 단계에서 null check
 */
fun main() {
    // Not null type
    var name : String = "Lee"
    var number : Int = 10

    // null type
    var nickname : String? = null
    var secondNum : Int? = null

    val result = if (nickname == null){
        "not in value"
    } else{
        nickname
    }

    val result2 = nickname?: "not value"

    val size = nickname?.length

    val test = "this is not null"!!.length
    println(result)
    println(result2)
    println(size)
}