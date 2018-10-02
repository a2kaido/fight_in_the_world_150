package com.a2kaido.chapter1.c1_1

fun main(args: Array<String>) {

    println(isUniqueChar("abcdef"))
    println(isUniqueChar("abcdea"))

    println(isUniqueChar2("abcdef"))
    println(isUniqueChar2("abcdea"))
}

fun isUniqueChar(str: String): Boolean {
    val map = HashMap<Char, Int>()

    for (c in str) {
        map[c] = 0
    }

    return map.size == str.length
}

fun isUniqueChar2(str: String): Boolean {
    for (i in 0..(str.length - 2)) {
        for (j in (i+1)..(str.length - 1)) {
            if (str[i] == str[j]) return false
        }
    }

    return true
}
