package com.clf.springboot01.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author 巧克力爱王子
 * @Date 2021/9/11 13:53
 * @Version 1.0
 */
@Component
@PropertySource(value="classpath:user.properties")
public class User {
    @Value("${user.name}")
    private String name;
    @Value("#{9*2}")
    private int age;
    @Value("男")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
