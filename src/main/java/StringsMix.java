import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringsMix {
    public static String mix(String s1, String s2) {
        int[] s1Count = calculateWords(s1);
        int[] s2Count = calculateWords(s2);
        ArrayList<String> arrayListStr = new ArrayList<>();
        String[] en = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String temp;

        int length = s1Count.length > s2Count.length ? s1Count.length : s2Count.length;
        for (int i = 0; i < length; i++) {
            if (s1Count[i] > s2Count[i] && s1Count[i] > 1) {
                temp = "";
                for (int j = 0; j < s1Count[i]; j++) {
                    temp += en[i];
                }
                if (!arrayListStr.contains(temp)) {
                    temp = ("1:" + temp);
                    arrayListStr.add(temp);
                }
            } else if (s1Count[i] < s2Count[i] && s2Count[i] > 1) {
                temp = "";
                for (int j = 0; j < s2Count[i]; j++) {
                    temp += en[i];
                }
                if (!arrayListStr.contains(temp)) {
                    temp = ("2:" + temp);
                    arrayListStr.add(temp);
                }
            } else {
                temp = "";
                for (int j = 0; j < s1Count[i]; j++) {
                    temp += en[i];
                }
                if (!arrayListStr.contains(temp) && temp.length() > 1) {
                    temp = ("=:" + temp);
                    arrayListStr.add(temp);
                }
            }
        }

        return arrayListStr.stream()
                .sorted(Comparator.comparing(String::length).reversed().thenComparing(String::compareTo))
                .collect(Collectors.joining("/"));

    }

    private static int[] calculateWords(String str) {
        int[] total = new int[26];
        str = str.replaceAll("[^a-z]", "");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            total[(ch - 'a')]++;
        }
        return total;
    }
}
