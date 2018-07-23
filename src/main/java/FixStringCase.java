public class FixStringCase {
    public static String solve(final String str) {
        //check str uppercase or lowercase which is more
        int lowerCase = 0;
        int upperCase = 0;
        String output;
        if (str != "") {
            for (int i = 0; i < str.length(); i++) {
                char inputCase = str.charAt(i);
                if (Character.isUpperCase(inputCase)) {
                    upperCase++;
                } else if (Character.isLowerCase(inputCase)) {
                    lowerCase++;
                }
            }
        }
        //solve it
        if (lowerCase > upperCase || lowerCase == upperCase) {
            output = str.toLowerCase();
        } else {
            output = str.toUpperCase();
        }
        return output; //your code here
    }
}
