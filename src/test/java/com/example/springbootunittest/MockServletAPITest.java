package com.example.springbootunittest;

import org.junit.Test;
import org.springframework.mock.web.MockServletContext;

public class MockServletAPITest {


    @Test
    public void testMockServletContext() {

        MockServletContext mockServletContext = new MockServletContext();

        mockServletContext.setInitParameter("abc","def");

    }


}
