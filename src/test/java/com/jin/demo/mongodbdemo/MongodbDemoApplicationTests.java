package com.jin.demo.mongodbdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class MongodbDemoApplicationTests {

    @Autowired
    ResumeRepository resumeRepository;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            Resume resume = new Resume();
            resume.setBirthday(new Date());
            resume.setCity("sh");
            resume.setExpectSalary(55000.00);
            resume.setName("赵六"+i);
            resumeRepository.save(resume);
        }
        resumeRepository.findAll().forEach(System.out::println);
    }

}
