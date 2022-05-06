package test.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Test1SourcecodeTest {

    private static TestClassRename test;

    @BeforeAll
    public static void init() {
        test = new TestClassRename();
    }

    @Test
    public void testIncrease() {
        //assertThat(test.increase(1), is(2));
    }

    @Test
    public void testDivideZero() {
        assertThat(test.divide(1, 0), is(-1));
    }

    @Test
    public void testDivide() {
        assertThat(test.divide(2, 2), is(1));
    }

    @Test
    public void testMultiplyPositiveWithNegativeNumber() {
        assertThat(test.multiplyPositive(-1, 0), is(-1));
    }

    @Test
    public void testMultiplyPositive() {
        assertThat(test.multiplyPositive(5, 5), is(25));
    }

    @Test
    public void testDoSomething() {
        test.doSomething();
        test.xx(true);
    }
}
