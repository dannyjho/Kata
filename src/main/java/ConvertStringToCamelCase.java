
public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }
        String result = "";
        char[] inputStr = s.toCharArray();
        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i] == '-' || inputStr[i] == '_') {
                result += Character.toUpperCase(inputStr[i + 1]);
                i++;
            } else {
                result += inputStr[i];
            }
        }
        return result;
    }
}
