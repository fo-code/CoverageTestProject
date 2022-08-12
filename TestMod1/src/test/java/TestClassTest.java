import org.junit.jupiter.api.Test;
import test.internal.TestFile;

public class TestClassTest {

    @Test
    public void testZ() {
        DuplicateFile testClass = new DuplicateFile();
        testClass.duplicateMethod();
    }

    @Test
    public void testFile() {
        TestFile test = new TestFile();
        test.testMethod();
    }
}
