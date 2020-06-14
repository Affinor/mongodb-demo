package com.jin.demo.mongodbdemo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangjin
 */
@Document("lg_resume_datas")
public class Resume implements Serializable {

    private static final long serialVersionUID = -5290952333371367254L;

    private String id;
    private String name;
    private String city;
    private Date birthday;
    private Double expectSalary;

    @Override
    public String toString() {
        return "Resume{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                ", expectSalary=" + expectSalary +
                '}';
    }

    public Resume() {
    }

    public Resume(String id, String name, String city, Date birthday, Double expectSalary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.birthday = birthday;
        this.expectSalary = expectSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(Double expectSalary) {
        this.expectSalary = expectSalary;
    }
}
