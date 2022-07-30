import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test1SourcecodeTest {

    private static TestClassRenamed testR;

    @BeforeAll
    public static void init() {
        testR = new TestClassRenamed();
    }

    @Test
    public void testHey() {
        testR.test();
    }
}
