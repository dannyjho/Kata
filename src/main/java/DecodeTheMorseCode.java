import java.util.HashMap;
import java.util.Map;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        String words = "";
        String[] codes = morseCode.split("   ");
        for (String code : codes) {
            String[] chars = code.split(" ");
            for (String ch : chars) {
                if(getCode(ch)!=null){
                    words += getCode(ch);
                }
            }
            words += " ";
        }

        return words.trim();
    }

    private static String getCode(String ch) {
        for (Map.Entry<String, String> entry : codeMap.entrySet()) {
            if (ch.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return "";
    }

    private static Map<String, String> codeMap;

    static {
        codeMap = new HashMap<String, String>();

        codeMap.put("A", ".-");
        codeMap.put("B", "-...");
        codeMap.put("C", "-.-.");
        codeMap.put("D", "-..");
        codeMap.put("E", ".");
        codeMap.put("F", "..-.");
        codeMap.put("G", "--.");
        codeMap.put("H", "....");
        codeMap.put("I", "..");
        codeMap.put("J", ".---");
        codeMap.put("K", "-.-");
        codeMap.put("L", ".-...");
        codeMap.put("M", "--");
        codeMap.put("N", "-.");
        codeMap.put("O", "---");
        codeMap.put("P", ".--.");
        codeMap.put("Q", "--.-");
        codeMap.put("R", ".-.");
        codeMap.put("S", "...");
        codeMap.put("T", "-");
        codeMap.put("U", "..-");
        codeMap.put("V", "...-");
        codeMap.put("W", ".--");
        codeMap.put("X", "-..-");
        codeMap.put("Y", "-.--");
        codeMap.put("Z", "--..");

        codeMap.put("0", "-----");
        codeMap.put("1", ".----");
        codeMap.put("2", "..---");
        codeMap.put("3", "...--");
        codeMap.put("4", "....-");
        codeMap.put("5", ".....");
        codeMap.put("6", "-....");
        codeMap.put("7", "--...");
        codeMap.put("8", "---..");
        codeMap.put("9", "----.");

        codeMap.put(".", "-----");
        codeMap.put(":", ".----");
        codeMap.put(",", "..---");
        codeMap.put(";", "...--");
        codeMap.put("?", "....-");
        codeMap.put("=", ".....");
        codeMap.put("'", "-....");
        codeMap.put("/", "--...");
        codeMap.put("!", "....-");
        codeMap.put("-", ".....");
        codeMap.put("_", "-....");
        codeMap.put("\"", "--...");
        codeMap.put("(", "....-");
        codeMap.put(")", ".....");
        codeMap.put("$", "-....");
        codeMap.put("&", "--...");
        codeMap.put("@", "---..");
    }
}
