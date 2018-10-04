package com.a2kaido.chapter1.c1_7

import java.util.*

fun main(args: Array<String>) {
    val n = 5
    val m = 6

    val matrix = Matrix(n, m)
    val matrix2 = Matrix(n, m)
    matrix.copy(matrix2)
    for (i in 0..(m-1)) {
        for (j in 0..(n-1)) {
            if (matrix.value[i][j] == 0) {
                matrix2.zeroFill(i, j)
            }
        }
    }
    matrix2.print()
}

class Matrix(private val n: Int, private val m: Int) {
    var value: Array<Array<Int>> = Array(m) { _ -> Array(n) { 0 }}

    init {
        for (i in 0..(m-1)) {
            for (j in 0..(n-1)) {
                value[i][j] = Random().nextInt(9) + 1
            }
        }
        value[2][3] = 0
    }

    fun zeroFill(x: Int, y: Int) {
        for (i in 0..(m-1)) {
            value[i][y] = 0
        }

        for (i in 0..(n-1)) {
            value[x][i] = 0
        }
    }

    fun print() {
        for (i in 0..(m-1)) {
            val builder = StringBuilder()
            for (j in 0..(n-1)) {
                builder.append(value[i][j])
            }
            println(builder.toString())
        }
    }

    fun copy(matrix: Matrix) {
        for (i in 0..(m-1)) {
            for (j in 0..(n-1)) {
                matrix.value[i][j] = value[i][j]
            }
        }
    }
}
