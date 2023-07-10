package com.huongdankotlin.designpattern.lsp

class Square : Shape {
    var side: Int = 0

    override fun area(): Int {
        return side * side;
    }
}