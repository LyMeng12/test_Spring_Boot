package com.test.project.Service.Impl;

import com.test.project.Service.TeacherService;
import com.test.project.model.Teacher;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public Teacher findById() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("KAKA");
        return teacher;
    }
}
