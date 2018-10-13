package com.a2kaido.chapter2.c2_1

import com.a2kaido.chapter2.Node

fun main(arg: Array<String>) {

    val header = Node("head")
    header.next = Node("a")
    header.next?.next = Node("b")
    header.next?.next?.next = Node("b")
    header.next?.next?.next?.next = Node("d")
    header.next?.next?.next?.next?.next = Node("b")

    header.printAll()

    println("=========================")

    val header2 = deleteDup(header)
    header2.printAll()
}

fun deleteDup(head: Node<String>): Node<String> {
    var n = head
    while (n.next != null) {
        var p: Node<String>? = n
        while (p?.next != null) {
            if (n.value == p.next?.value) {
                p.next = p.next?.next
            }
            p = p.next
        }

        n = n.next!!
    }

    return head
}
