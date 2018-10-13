package com.a2kaido.chapter2

class Node<T>(val value: T) {
    var next: Node<T>? = null

    fun printAll() {
        var p: Node<T>? = this
        while (p != null) {
            println(p.value)
            p = p.next
        }
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