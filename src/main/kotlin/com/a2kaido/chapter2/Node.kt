package com.a2kaido.chapter2

import java.util.*

class Node<T>(val value: T) {
    var next: Node<T>? = null

    fun printAll() {
        var p: Node<T>? = this
        val builder = StringJoiner(" -> ")
        while (p != null) {
            builder.add(p.value.toString())
            p = p.next
        }
        println(builder.toString())
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Node<*>) {
            value == other.value
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}