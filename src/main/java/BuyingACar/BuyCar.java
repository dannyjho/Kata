package BuyingACar;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double leftOverMoney = 0;
        double tempPriceOld = startPriceOld;
        double tempPriceNew = startPriceNew;
        int totalSavingMoney = 0;
        while (tempPriceOld + totalSavingMoney < tempPriceNew) {
            month++;
            totalSavingMoney += savingperMonth;
            if (month % 2 == 0) {
                percentLossByMonth += 0.5;
            }
            tempPriceOld = tempPriceOld * (1 - (percentLossByMonth / 100));
            tempPriceNew = tempPriceNew * (1 - (percentLossByMonth / 100));
        }
        leftOverMoney = tempPriceOld + totalSavingMoney - tempPriceNew;
        return new int[]{month, (int) Math.round(leftOverMoney)};
    }
}
