package com.example.kotlin

fun main(){
    // let, run, apply, also, with
    val a = 31
    a.let {  }
    // 수신객체.let{ UserTest ->
    //
    //     마지막줄 // return
    // }
    val user : UserTest? = UserTest("Lee", 31, true)
    var age = user?.let { it :UserTest ->
        it.age
    }
    println(age)

    // run
    // 수신객체.run ( this ->
    //
    //      마지막줄 // return
    // }
    // 초기화 할때 많이 사용
    val kid = UserTest("baby", 4, false)
    val kidAge = kid.run {
        age
    }
    println(kidAge)
    // apply
    // 수신객체.apply {
    //
    // }
    // 자기 자신을 수신객체
    val kidName = kid.apply {
        name
    }
    println(kidName)
    val boy = UserTest("BJ", 8, true, true)
    val bayValue = boy.apply {
        hasGlasses = false
    }
    println(bayValue.hasGlasses)
    // also
    // 수신객체.also { it -> // local variable
    //
    //
    // } return 수신객체(자기자신)
    // 로그를 확일할때 많이 사용
    var girl = UserTest("SK", 10, false, false)
    val girlValue = girl.also {
        it.name
        it.hasGlasses = true
    }
    println(girlValue.hasGlasses)
    // with
    // with(수신객체) {
    //
    // 마지막줄 // return
    // }
    val result = with(girl){
        hasGlasses = false
        age = 66
        true
    }
    println("result : " + result)
    println("girl.age : " + girl.age
    )
}

class UserTest(
    val name : String,
    val age : Int,
    val gender : Boolean,   // true : male, false : female
    var hasGlasses : Boolean = true,
)