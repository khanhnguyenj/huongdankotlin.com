package com.huongdankotlin.designpattern.lsp

fun main() {
    var r1: Rectangle = Rectangle()
    r1.width = 5
    r1.height = 4
    println(r1.area())

    var r2: Square = Square()
    r2.side = 5
    println(r2.area())
}