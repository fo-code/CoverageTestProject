package test.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Test3Test {

    @Test
    public void testNewOne() {
        Test3 test3 = new Test3();
        assertThat(test3.newOne(), is(""));
    }

    @Test
    public void testNewTwo() {
        Test3 test3 = new Test3();
        assertThat(test3.newTwo(), is(""));
    }

    @Test
    public void testGet() {
        Test3 test3 = new Test3();
        assertThat(test3.get(), is(""));
    }
}
