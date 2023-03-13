package com.example.kotlin

import java.time.DayOfWeek


/**
 * Java 와 Kotlin 의 조건식 차이점
 * Java 는 조건식이 return 값을 가질 수 없는 statement
 * Kotlin 은 return 변수에 할당 될 수 있는 expression
 * 삼항연산자는 없지만 Single Expression 으로 표현 가능
 *
 * case 문을 expression 으로 사용할 시 return 값은 필수 (not null)
 */
fun main(){
    max(10,20)
}


fun max (a : Int, b : Int){
    val result = if(a > b){
        a
    } else{
        b
    }
    val result2 = if(a > b) a else b

    val result3 = isHoliday("월")
    println(result)
    println(result2)
}

// 월, 화, 수, 목, 금, 토, 일
fun isHoliday(dayOfWeek: Any){
    val result = when (dayOfWeek) {
        "토",
        "일" -> true
        "월",
        "화",
        "수",
        "목",
        "금" -> false
        in 2 .. 4 -> {}
        in listOf(1,2,3,) -> {}
        else -> false
    }
}