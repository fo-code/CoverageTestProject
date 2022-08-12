import org.junit.jupiter.api.Test;

public class TestClassTest {

    @Test
    public void testZ() {
        DuplicateFile testClass = new DuplicateFile();
        testClass.duplicateMethod();
    }

    @Test
    public void testClass() {
        TestClass test = new TestClass();
        test.test();
        test.test2(true);
        test.test4(false);
    }
}
