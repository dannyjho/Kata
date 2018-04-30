import java.util.ArrayList;

public class AveragesOfNumbers {
    public static double[] averages(int[] numbers) {
        ArrayList<Double> list = new ArrayList();
        if(numbers!=null&&numbers.length>1){
            for (int i = 0; i <= numbers.length; i++) {
                if (i + 1 < numbers.length) {
                    double average = (numbers[i] + numbers[i + 1]) / 2.0;
                    list.add(average);
                }
            }
        }
        if (numbers==null||numbers.length <= 0) {
            double[] avg = new double[0];
            return avg;
        } else {
            double[] avg = new double[numbers.length - 1];
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0 || list.get(i) == null) {
                    avg[i] = 0;
                } else {
                    avg[i] = list.get(i);
                }
                System.out.println(avg[i]);
            }
            return avg;
        }
    }
}
