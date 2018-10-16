package com.a2kaido.chapter2.c2_4

import com.a2kaido.chapter2.Node

fun main(args: Array<String>) {
    val header = Node(0)
    header.next = Node(1000)
    header.next?.next = Node(30)
    header.next?.next?.next = Node(50)
    header.next?.next?.next?.next = Node(2)
    header.next?.next?.next?.next?.next = Node(300)

    sort(header, 40).printAll()
}

fun sort(header: Node<Int>, x: Int): Node<Int> {
    var result = Node(header.value)

    var head: Node<Int>? = header
    head = head?.next

    while (head != null) {
        if (head.value < x) {
            result = Node(head.value).apply { next = result }
        } else {
            var xxx: Node<Int>? = result
            while (xxx?.next != null) {
                xxx = xxx.next
            }
            xxx?.next = Node(head.value)
        }

        head = head.next
    }

    return result
}
