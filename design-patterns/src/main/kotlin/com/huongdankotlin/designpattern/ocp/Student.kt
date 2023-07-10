package com.huongdankotlin.designpattern.ocp

open class Student {
    open fun classify(score: Int): Classification {
        if (score > 9) {
            return Classification.EXCELLENCE
        }
        if (score > 8) {
            return Classification.GOOD
        }
        if (score > 6) {
            return Classification.NORMAL
        }

        return Classification.MEDIUM
    }
}