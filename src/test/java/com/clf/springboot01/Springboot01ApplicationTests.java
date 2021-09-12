package com.clf.springboot01;

import com.clf.springboot01.pojo.Person;
import com.clf.springboot01.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void testUser(){
        System.out.println(user);
    }
    @Test
    void testUser2(){
        System.out.println("git test");
    }


}
