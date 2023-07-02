package com.example.lambdafunctions

fun main() {
    println(" We are a chosen generation")
    var list = (1..20).toList()
    println(list)
    list = list.filter { it >= 7 }
    println(list)
    var digits = length
    digits = list.filter { it % 5 == 0 }
    println(digits)
    val circlecalc = circle(22)
    val rectangle = rectangle(34, 45)
    val triangle = triangle(23, 12, 45)
    val square = square(34.5)
    var shape = listOf(circlecalc, rectangle, triangle, square)
    println(shape)
}

var length = (1..30).toList()

