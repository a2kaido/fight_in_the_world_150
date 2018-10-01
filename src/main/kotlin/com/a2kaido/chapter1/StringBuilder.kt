package com.a2kaido.chapter1

fun main(args: Array<String>) {
    val start = System.currentTimeMillis()
    noUseStringBuilder()
    val end = System.currentTimeMillis()
    println(end - start)

    val start2 = System.currentTimeMillis()
    useStringBuilder()
    val end2 = System.currentTimeMillis()
    println(end2 - start2)

    val start3 = System.currentTimeMillis()
    println(useMyStringBuilder())
    val end3 = System.currentTimeMillis()
    println(end3 - start3)
}

fun noUseStringBuilder(): String {
    val x = "a"
    var result = ""

    for (i in 0..100000) {
        result += x
    }

    return result
}

fun useStringBuilder(): String {
    val x = "a"
    val stringBuilder = StringBuilder()

    for (i in 0..100000) {
        stringBuilder.append(x)
    }

    return stringBuilder.toString()
}

fun useMyStringBuilder(): String {
    val x = "a"
    val stringBuilder = MyStringBuilder()

    for (i in 0..100000) {
        stringBuilder.add(x)
    }

    return stringBuilder.toString()
}

class MyStringBuilder: ArrayList<String>() {
    override fun toString(): String {
        return joinToString(separator = "")
    }
}

