package listener;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class PersonIntegrationTestListener extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {

        System.err.println("before:  " + testContext.getTestMethod());
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {

        System.err.println("after:  " + testContext.getTestMethod());
    }
}
