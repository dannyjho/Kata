import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class NumberOfPeopleInTheBusTest {

    NumberOfPeopleInTheBus numberOfPeopleInTheBus = new NumberOfPeopleInTheBus();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        list.add(new int[] {3,5});
        assertEquals(3, numberOfPeopleInTheBus.countPassengers(list));
    }

}
