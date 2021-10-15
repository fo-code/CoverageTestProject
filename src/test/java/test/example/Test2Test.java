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
    public void testIncrease() {
        assertThat(test.substract(1), is(0));
    }

    @Test
    public void testDivide() {
        assertThat(test.multiplyPositive(-1, 0), is(-1));
    }
}
