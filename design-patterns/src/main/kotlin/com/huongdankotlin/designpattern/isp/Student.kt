package com.huongdankotlin.designpattern.isp

class Student : Human, Cooker, Runner {
    override fun cook() {
        println("Student is cooking ...")
    }

    override fun eat() {
        println("Student is eating ...")
    }

    override fun run() {
        println("Student is running ...")
    }
}