import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MainTest {

    @Test
    public void testReturnOne() {
        assertThat(Main.returnOne(), is(1));
    }
}
