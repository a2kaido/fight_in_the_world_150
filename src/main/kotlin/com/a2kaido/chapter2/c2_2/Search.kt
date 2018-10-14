package com.a2kaido.chapter2.c2_2

import com.a2kaido.chapter2.Node

fun main(args: Array<String>) {
    val header = Node("head")
    header.next = Node("a")
    header.next?.next = Node("b")
    header.next?.next?.next = Node("b")
    header.next?.next?.next?.next = Node("d")
    header.next?.next?.next?.next?.next = Node("b")

    println(searchK(header, 2)?.value)
}

fun searchK(header: Node<*>, k: Int): Node<*>? {
    var head: Node<*>? = header
    var node: Node<*>? = header
    for (i in 0..(k-1)) {
        node = node?.next
    }

    if (node == null) return null

    while (node != null) {
        head = head?.next
        node = node.next
    }

    return head
}
