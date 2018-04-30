import java.util.Arrays;

public class CountingDuplicates {
    public static void main(String arg[]) {
        duplicateCount(" abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    public static int duplicateCount(String text) {
        //toLowerCase
        String textInLowerCase = text.toLowerCase();
        //change to char array
        char[] textTemp = textInLowerCase.toCharArray();
        //sort
        Arrays.sort(textTemp);
        String sortedText = String.valueOf(textTemp);
        System.out.println(sortedText);
        char[] sortedTextTemp = sortedText.toCharArray();
        int count=0;
        while(sortedText.length()>1){
            if(sortedText.lastIndexOf(sortedTextTemp[0])!=sortedText.indexOf(sortedTextTemp[0])){
                sortedText=sortedText.substring(sortedText.lastIndexOf(sortedTextTemp[0])+1);
                sortedTextTemp =sortedText.toCharArray();
                count++;
            }else{
                sortedText=sortedText.substring(sortedText.lastIndexOf(sortedTextTemp[0])+1);
                sortedTextTemp =sortedText.toCharArray();
                continue;
            }
        }
        return count;
    }
}
