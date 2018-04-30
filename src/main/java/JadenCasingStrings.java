

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        char[] str = phrase.toCharArray();
        str[0] = Character.toUpperCase(str[0]);
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                str[i + 1] = Character.toUpperCase(str[i + 1]);
            }
        }
        return String.valueOf(str);
    }
}
