package test.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Test1Test {

    private static Test1 test;

    @BeforeAll
    public static void init() {
        test = new Test1();
    }

    @Test
    public void testIncrease() {
        assertThat(test.increase(1), is(2));
    }

    @Test
    public void testDivide() {
        assertThat(test.devide(1, 0), is(-1));
    }

    @Test
    public void testTest() {
        test.test(1);
    }
}
