package test;

import org.junit.jupiter.api.Test;

public class TestClassTest {

    @Test
    public void testZ() {
        TestFile testClass = new TestFile();
        test.internal.TestFile t = new test.internal.TestFile();
        testClass.otherMethod();
    }
}
