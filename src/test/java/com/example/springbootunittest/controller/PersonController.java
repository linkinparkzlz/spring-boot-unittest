package com.example.springbootunittest.controller;


import com.example.springbootunittest.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @Autowired
    private Person person;


    @GetMapping
    public Person person() {
        return person;
    }


}
