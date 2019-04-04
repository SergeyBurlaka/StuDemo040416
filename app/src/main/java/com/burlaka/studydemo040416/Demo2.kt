package com.burlaka.studydemo040416

/**
 * @author BRCJU
 * @since 04.04.2019
 */

val sum: Int.() -> Int = { plus(this) }

val applySum: Php.(Double, String) -> Int = { double, str ->
    sum(str.toInt(),double.toInt())
}

fun main() {

    println(Php().applySum(5.0, "5"))
}


class Php{

    fun sum(a:Int, b:Int):Int{
        return a+b
    }
}