package BuyingACar;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuyCarTest {
    @Test
    public void test1() {
        int[] r = new int[]{6, 766};
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }

    @Test
    public void test2() {
        int[] r = new int[]{0, 4000};
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
    }

    @Test
    public void When_Old_Is_7000_New_Is_8000_perMonthSave_1000_PercentLoss_1point5_Then_Return_One_Month_And_Left_() {
        int[] leftMoney = new int[]{1,15};
        assertArrayEquals(leftMoney, BuyCar.nbMonths(7000, 8000, 1000, 1.5));
    }

    @Test
    public void When_Old_Is_7000_New_Is_8000_perMonthSave_985_PercentLoss_1point5_Then_Return_One_Month_And_Left_() {
        int[] leftMoney = new int[]{1,0};
        assertArrayEquals(leftMoney, BuyCar.nbMonths(7000, 8000, 985, 1.5));
    }
}