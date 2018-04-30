import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindDivisorsOfANumberTest {

    @Test
    public void testDivisors(){
        FindDivisorsOfANumber findDivisorsOfANumber = new FindDivisorsOfANumber();
        int n = 12;
        assertEquals(6,findDivisorsOfANumber.numberOfDivisors(n));
    }
}
