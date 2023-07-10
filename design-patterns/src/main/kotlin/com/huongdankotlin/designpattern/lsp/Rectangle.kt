package com.huongdankotlin.designpattern.lsp

open class Rectangle: Shape {

    var width: Int = 0
    var height: Int = 0

    override fun area(): Int {
        return this.width * this.height;
    }
}