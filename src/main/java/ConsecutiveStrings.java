public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || strarr.length < k || k <= 0) {
            return "";
        }
        String longestStr = "";
        for (int i = 0; i < strarr.length - k + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                sb.append(strarr[j]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
