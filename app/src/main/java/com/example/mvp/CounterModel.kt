package com.example.mvp

class CounterModel {
    private val counters = mutableListOf(0, 0, 0)

    fun getCounter(position: Int): Int {
        return counters[position]
    }

    fun next(position: Int): Int {
        return counters[position]++

    }

    fun set(position: Int, value: Int) {
        counters[position] = value
    }
}