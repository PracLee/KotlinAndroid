package com.example.kotlin


/**
 * type-check
 * Obj is Type
 */
fun main (){
    println(check("Hi"))
    println(check(23))
    println(check(true))
    cast("Hi - High")
    cast(10)
    cast(false)
    println(smartCast("bye - bye"))
    println(smartCast(100))
    println(smartCast(false))
}

fun check(a : Any) : String{
    return when (a) {
        is String -> {
            "String"
        }
        is Int -> {
            "Number"
        }
        else -> {
            "Don't Know"
        }
    }
}

fun cast (a : Any) {
    var result = a as? String
    var result2 = (a as? String) ?: "Fail"
    println(result)
    println("result2 : " + result2)
}

// type이 체크된 같은 블럭 안에서는 type 체크가 필요 없
fun smartCast(a: Any) : Int {
    return if(a is String){
        a.length
    }else if (a is Int){
        a.dec()
    }else{
        -1
    }
}