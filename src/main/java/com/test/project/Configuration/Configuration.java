package com.test.project.Configuration;

import com.test.project.Service.Impl.StudentServiceImpl;
import com.test.project.Service.Impl.TeacherServiceImpl;
import com.test.project.Service.StudentService;
import com.test.project.Service.TeacherService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public StudentService getService() {
        return new StudentServiceImpl();
    }
    @Bean
    public TeacherService getTeacherService() {
        return new TeacherServiceImpl();
    }
}
