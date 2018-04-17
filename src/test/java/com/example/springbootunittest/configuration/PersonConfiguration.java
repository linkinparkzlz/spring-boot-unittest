package com.example.springbootunittest.configuration;

import com.example.springbootunittest.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfiguration {


    @Bean("primaryPerson")
    @Primary
    public Person person() {

        Person person = new Person();

        person.setId(1L);
        person.setName("走走走");
        person.setAge(33);


        return person;


    }


}















