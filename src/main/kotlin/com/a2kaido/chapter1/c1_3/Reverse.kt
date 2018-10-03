package com.a2kaido.chapter1.c1_3

fun main(str: Array<String>) {
    println(checkReverse("abcdef", "fedcba"))
    println(checkReverse("abcdef", "fedc"))
    println(checkReverse("abcdefef", "fefedcba"))
}

fun checkReverse(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    var result = true
    for (i in 0..(str1.length-1)) {
        if (str1[i] != str2[str1.length-1-i]) {
            result = false
        }
    }

    return result
}
