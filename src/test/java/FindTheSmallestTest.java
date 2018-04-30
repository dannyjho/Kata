import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FindTheSmallestTest {

    private static void testing(long n, String res) {
        assertEquals(res,
                Arrays.toString(FindTheSmallest.smallest(n)));
    }

    @Test
    public void test() {
        System.out.println("Basic Tests smallest");
        testing(126235, "[122635, 3, 1]");
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
        testing(381346783, "[138346783, 2, 0]");
        testing(187863002809L, "[18786300289, 10, 0]");
        testing(199819884756L, "[119989884756, 4, 0]");
        testing(6611400894076L,"[66114089407604864, 0, 7]");
    }
}
