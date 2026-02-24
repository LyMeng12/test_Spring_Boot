package com.test.project.Service.Impl;


import com.test.project.Service.StudentService;
import com.test.project.model.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student fiandByid() {
        Student student = new Student();
        student.setId(1);
        student.setName("Meng");
        return student;
    }
}
