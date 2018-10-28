package com.a2kaido.chapter2.c2_5

import com.a2kaido.chapter2.Node

fun main(args: Array<String>) {

    val header = Node(7)
    header.next = Node(1)
    header.next?.next = Node(6)

    val header2 = Node(2)
    header2.next = Node(3)
    header2.next?.next = Node(4)

    header.printAll()
    header2.printAll()
    (header.getNumber() + header2.getNumber()).toNode()?.printAll()
}

fun Node<Int>.getNumber(): Int {
    var p: Node<Int>? = this
    var result = 0.0
    var loop = 0.0
    while (p != null) {
        result += Math.pow(10.0, loop) * p.value

        loop++
        p = p.next
    }

    return result.toInt()
}

fun Int.toNode(): Node<Int>? {

    val head = Node(0)
    var p: Node<Int> = head
    val length = this.toString().length - 1

    for (i in 0..length) {
        p.next = Node(this.toString()[length - i].toString().toInt())
        p = p.next as Node<Int>
    }

    return head.next
}
