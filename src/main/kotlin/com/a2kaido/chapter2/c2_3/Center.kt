package com.a2kaido.chapter2.c2_3

import com.a2kaido.chapter2.Node

fun main(args: Array<String>) {
    val header = Node("head")
    header.next = Node("a")
    header.next?.next = Node("b")
    header.next?.next?.next = Node("b")
    header.next?.next?.next?.next = Node("d")
    header.next?.next?.next?.next?.next = Node("b")

    header.printAll()

    header.next?.next?.next = header.next?.next?.next?.next

    header.printAll()
}
