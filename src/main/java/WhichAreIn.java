import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    arrayList.add(array1[i]);
                    break;
                }
            }
        }
        String[] resultArray = arrayList.toArray(new String[arrayList.size()]);
        Arrays.sort(resultArray);
        return resultArray;
    }
}
