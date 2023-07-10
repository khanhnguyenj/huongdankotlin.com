package com.huongdankotlin.designpattern.ocp

class WeakStudent : Student() {
    override fun classify(score: Int): Classification {
        if (score < 5) {
            return Classification.WEAK
        }

        return super.classify(score);
    }
}