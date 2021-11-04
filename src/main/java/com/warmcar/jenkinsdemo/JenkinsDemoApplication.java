package com.warmcar.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello jenkins";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsDemoApplication.class);
    }
}
