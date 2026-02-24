package com.test.project.Configuration;

import com.test.project.Service.Impl.StudentServiceImpl;
import com.test.project.Service.StudentService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public StudentService getService() {
        return new StudentServiceImpl();
    }
}
