import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixStringCaseTest {
    @Test
    public void BasicTests() {
        assertEquals("code", FixStringCase.solve("code"));
        assertEquals("CODE", FixStringCase.solve("CODe"));
        assertEquals("code", FixStringCase.solve("COde"));
        assertEquals("code", FixStringCase.solve("Code"));
        assertEquals("", FixStringCase.solve(""));
    }
}
