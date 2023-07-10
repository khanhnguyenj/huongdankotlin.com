package com.huongdankotlin

fun main() {
    var student = Student()
    student.name = "Khanh"

    casting(student);
}

fun casting(x: Any) {
    if (x is Student && x.name.length >= 5) {
        println("Valid student name!")
    }
}