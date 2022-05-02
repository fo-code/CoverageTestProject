package test.example;

import org.junit.jupiter.api.Test;

public class SourcecodeTestTest {

    @Test
    public void testInsertedTested() {
        SourcecodeTest test = new SourcecodeTest();
        test.first();
        test.second();
    }

    @Test
    public void test() {
        SourcecodeTest test = new SourcecodeTest();
        test.x();
    }
}
