package com.jin.demo.mongodbdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author wangjin
 */
public interface ResumeRepository extends MongoRepository<Resume,String> {
    List<Resume> findByNameEquals(String name);
    List<Resume> findByNameAndExpectSalary(String name,Double expectSalary);
}
