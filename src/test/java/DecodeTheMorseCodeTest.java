import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DecodeTheMorseCodeTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
