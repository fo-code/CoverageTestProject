package test.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Test2Test {

    private static Test2 test;

    @BeforeAll
    public static void init() {
        test = new Test2();
    }

    @Test
    public void testSubtract() {
        assertThat(test.subtract(1), is(0));
    }

    @Test
    public void testMultiplyPositiveWithNegativeNumber() {
        //assertThat(test.multiplyPositive(-1, 0), is(-1));
    }

    @Test
    public void testMultiplyPositive() {
        assertThat(test.multiplyPositive(2, 2), is(4));
    }

    @Test
    public void testNew2() {
        test.newTest();
    }
}
