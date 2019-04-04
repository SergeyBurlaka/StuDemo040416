package com.burlaka.studydemo040416

/**
 * @author BRCJU
 * @since 04.04.2019
 */

class HTML {
    fun body() {}
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object

    html.init()        // pass the receiver object to the lambda

    return html
}

fun main(args: Array<String>) {

    html {
        // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }

    String().run {

    }

    String().apply {

    }

    val reult = Serg().runAny {
        getAge()
    }

    val reSULT2 = Serg().run {
       getAge()
    }

    var sum = 0

    val ints = arrayListOf<Int>(1,2,3)

    ints.filter {
        it > 0
    }.forEach {
        sum += it
    }
    print(sum)

}

class Serg{

    fun getName() = "Serg"

    fun getAge() = 32
}

fun <T,S> T.runAny(str: T.() -> S): S {
    return str()
}


