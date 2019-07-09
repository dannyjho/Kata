package DisariumNumber;

public class Solution {
    public static String disariumNumber(int number) {
        String temp = String.valueOf(number);
        int length = temp.length();
        int[] numbers = new int[length];
        int result = 0;

        for (int i = 0; i < length; i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));
            result = result + (int) Math.pow(numbers[i], i+1);
        }

        if (result == number) {
            return "Disarium !!";
        }

        return "Not !!";
    }

}
