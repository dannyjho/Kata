
import java.util.*;

public class FindTheSmallest {
    public static long[] smallest(long n) {

        String input = Long.toString(n);
        char[] inputCharArr = input.toCharArray();
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < inputCharArr.length; i++) {
            list.add(String.valueOf(inputCharArr[i]));
        }
        Collections.sort(list);
        long[] output;
        String result;
        String theSmallest = "";
        if (list.get(0).equals(String.valueOf(inputCharArr[0]))) {
            int i = 0;
            while (list.get(0) == list.get(i)) {
                i++;
            }
            theSmallest = list.get(i);
        } else {
            theSmallest = list.get(0);
        }
        int position = input.lastIndexOf(theSmallest);

        if (theSmallest.equals(0) && position > 1) {
            result = list.get(0) + input.substring(0, position) + input.substring(position + 1, input.length());
            output = new long[]{Long.parseLong(result), position, 0};
            return output;
        } else if (theSmallest.equals(0) && position == 1) {
            result = list.get(0) + input.substring(0, position) + input.substring(position + 1, input.length());
            output = new long[]{Long.parseLong(result), 0, position};
            return output;
        } else if(Integer.parseInt(theSmallest)>0){
            result = list.get(0) + input.substring(0, position) + input.substring(position + 1, input.length());
            output = new long[]{Long.parseLong(result), 0, position};
            return output;
        }


//        if (!list.get(0).equals(String.valueOf(inputCharArr[0]))) {
//            int position = input.lastIndexOf(list.get(0));
//            String result = list.get(0) + input.substring(0, position) + input.substring(position + 1, input.length());
//            if (position == 1) {
//                ouput = new long[]{Long.parseLong(result), 0, position};
//            } else {
//                ouput = new long[]{Long.parseLong(result), position, 0};
//            }
//            return ouput;
//        } else {
//            int position = input.lastIndexOf(list.get(1));
//            String result = input.substring(0, 1) + list.get(1) + input.substring(1, position) + input.substring(position + 1, input.length());
//            if (position != 0 && position != input.indexOf(list.get(1))) {
//                ouput = new long[]{Long.parseLong(result), position, 0};
//            } else {
//                ouput = new long[]{Long.parseLong(result), position, 1};
//            }
//            return ouput;
//        }
    }
}
