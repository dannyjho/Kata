import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStartAndMid() {
        String input = "Lake-Wall-Lake-Red-down-Street-down-Lake-up-Lake-Square";
        System.out.println("input: "+input);
        assertEquals("LakeWallLakeRedDownStreetDownLakeUpLakeSquare", ConvertStringToCamelCase.toCamelCase(input));
    }
}
