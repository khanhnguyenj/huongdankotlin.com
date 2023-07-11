package com.huongdankotlin.designpattern.dip

fun main() {
    val studentRepository: StudentRepository = StudentRepo1();

    val student = studentRepository.findById(1);

    println(student?.name)
}

interface StudentRepository {
    fun findById(id: Int): Student?
}

class StudentRepo1(): StudentRepository {
    private var students: List<Student> = ArrayList()

    init {
        students = arrayListOf(Student(1, "Khanh"), Student(2, "Quan"))
    }

    override fun findById(id: Int): Student? {
        for (student: Student in this.students) {
            if (student.id == id) {
                return student
            }
        }

        return null
    }
}

class Student(var id: Int, var name: String) {

}