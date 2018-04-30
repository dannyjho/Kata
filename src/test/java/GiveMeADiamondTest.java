import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GiveMeADiamondTest {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(5));
    }

    @Test
    public void testDiamond7() {
        StringBuffer expected = new StringBuffer();
        expected.append("   *\n");
        expected.append("  ***\n");
        expected.append(" *****\n");
        expected.append("*******\n");
        expected.append(" *****\n");
        expected.append("  ***\n");
        expected.append("   *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(7));
    }

}
