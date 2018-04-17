package com.example.springbootunittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.env.Environment;
import org.springframework.mock.env.MockEnvironment;

public class EnvironmentTest {


    @Test
    public void testSystemProperty() {


        // Assert.assertNotNull(System.getProperty("os.arch"));

        Environment environment = new MockEnvironment();

    }

}








