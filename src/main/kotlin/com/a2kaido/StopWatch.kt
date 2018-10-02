package com.a2kaido

class StopWatch {

    var tmp: Long = 0L

    fun start() {
        tmp = System.currentTimeMillis()
    }

    fun end(): Long {
        return System.currentTimeMillis() - tmp
    }
}