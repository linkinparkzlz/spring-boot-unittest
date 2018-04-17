package com.example.springbootunittest.spring.boot;


import com.example.springbootunittest.configuration.PersonConfiguration;
import com.example.springbootunittest.domain.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonConfiguration.class)
public class PersonSpringBootTest {


    @Autowired
    private Person person;


    @Test
    public void testPrimaryPerson() {


        Assert.assertEquals(Long.valueOf(1L),person.getId());
    }




}
