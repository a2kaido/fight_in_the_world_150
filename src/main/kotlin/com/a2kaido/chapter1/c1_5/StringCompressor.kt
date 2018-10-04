package com.a2kaido.chapter1.c1_5

fun main(args: Array<String>) {
    println(compress("aaabbbbccc"))
    println(compress("abcdefghi"))
}

fun compress(str: String): String {
    var i = 0
    var prev = ""
    val builder = StringBuilder()
    for (c in str) {
        if (c.toString() == prev) {
            i++
        } else {
            if (i < 0) {
                builder.append(i.toString())
            }
            i = 1
            builder.append(c)
        }

        prev = c.toString()
    }
    builder.append(i.toString())
    val res = builder.toString()
    return if (res.length > str.length) str else res
}
