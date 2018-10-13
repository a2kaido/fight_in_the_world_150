package com.a2kaido.chapter1.c1_8

fun main(args: Array<String>) {
    println(checkRotate("waterbottle", "erbottlewat"))
    println(checkRotate("waterbottle", "rbottlewate"))
    println(checkRotate("waterbottle", "brottlewate"))
}

fun checkRotate(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    return (str2+str2).contains(str1)
}
