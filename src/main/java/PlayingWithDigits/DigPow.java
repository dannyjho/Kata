package PlayingWithDigits;

public class DigPow {
    public static long digPow(int n, int p) {
        String temp = String.valueOf(n);
        int length = temp.length();
        int result = 0;
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));
        }

        for (int i = 0; i < numbers.length; i++) {
            result = result + (int) Math.pow(numbers[i], i + p);
        }

        if (result % n == 0) {
            return result / n;
        }

        return -1;
    }
}
