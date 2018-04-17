package com.example.springbootunittest;

import com.example.springbootunittest.configuration.PersonConfiguration;
import com.example.springbootunittest.domain.Person;
import listener.PersonIntegrationTestListener;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringRunner.class)
@ContextHierarchy(

        @ContextConfiguration(
                classes = PersonConfiguration.class
        )
)
@TestExecutionListeners(listeners = {PersonIntegrationTestListener.class, DependencyInjectionTestExecutionListener.class})
public class PersonIntegrationTest {


    @Autowired
    private Person person;


    @Before
    public void beforeTestPrimaryPerson() {


        System.out.println("before");

    }


    @BeforeClass
    public static void beforeClass() {

        System.out.println("beforeClass");

    }


//    @Test
//    public void testPrimaryPerson() {
//
//        Assert.assertEquals("走走走", person.getName());
//        Assert.assertEquals("33", person.getAge());
//        Assert.assertEquals(Integer.valueOf(33), person.getId());
//    }


    @After
    public void afterTestPrimaryPerson() {


        System.out.println("after");

    }


    @AfterClass
    public static void afterClass() {

        System.out.println("afterClass");

    }

}



























