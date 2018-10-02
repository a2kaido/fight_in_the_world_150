package com.a2kaido.chapter1

import com.a2kaido.StopWatch

fun main(args: Array<String>) {
    val sw = StopWatch()
    val loop = 10000

    sw.start()
    noUseStringBuilder(loop)
    println(sw.end())

    sw.start()
    useStringBuilder(loop)
    println(sw.end())

    sw.start()
    useMyStringBuilder(loop)
    println(sw.end())
}

fun noUseStringBuilder(loop: Int): String {
    val x = "a"
    var result = ""

    for (i in 0..loop) {
        result += x
    }

    return result
}

fun useStringBuilder(loop: Int): String {
    val x = "a"
    val stringBuilder = StringBuilder()

    for (i in 0..loop) {
        stringBuilder.append(x)
    }

    return stringBuilder.toString()
}

fun useMyStringBuilder(loop: Int): String {
    val x = "a"
    val stringBuilder = MyStringBuilder()

    for (i in 0..loop) {
        stringBuilder.add(x)
    }

    return stringBuilder.toString()
}

class MyStringBuilder: ArrayList<String>() {
    override fun toString(): String {
        return joinToString(separator = "")
    }
}


