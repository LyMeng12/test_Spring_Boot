package com.test.project.Controller;

import com.test.project.Service.StudentService;
import com.test.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private StudentService service;

    @Autowired
    public Controller(StudentService service) {
        this.service = service;
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student getStudent(){
        return service.fiandByid();
    }
}
