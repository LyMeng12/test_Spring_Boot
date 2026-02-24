package com.test.project.Controller;

import com.test.project.Service.StudentService;
import com.test.project.Service.TeacherService;
import com.test.project.model.Student;
import com.test.project.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private StudentService service;
    private TeacherService teacherService;

    @Autowired
    public Controller(StudentService service, TeacherService teacherService) {
        this.service = service;
        this.teacherService = teacherService;
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student getStudent(){
        return service.fiandByid();
    }

    @RequestMapping("/tea")
    @ResponseBody
    public Teacher getTeacher(){
        return teacherService.findById();
    }


}
