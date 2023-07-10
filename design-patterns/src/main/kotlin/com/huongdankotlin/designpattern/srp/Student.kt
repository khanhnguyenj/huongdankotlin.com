package com.huongdankotlin.designpattern.srp

class Student {
    var name: String = ""
    var age: Int = 0
}

class AttendanceManagement {
    var timesInClass = HashMap<String, HashMap<String, Int>>();

    fun addTimesInClass(studentId: String, subject: String, times: Int) {
        timesInClass.get(studentId)?.put(subject, times)
    }

    fun getTimesInClass(studentId: String, subject: String): Int? {
        return timesInClass.get(studentId)?.get(subject)
    }
}

class ClassManagement {
    fun getTimeTableByClassId() {
        // NOP
    }

    fun getTimeTableByStudentId() {
        // NOP
    }
}