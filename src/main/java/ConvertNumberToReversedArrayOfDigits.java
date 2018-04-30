

public class ConvertNumberToReversedArrayOfDigits {

    public static void main(String args[]){
        digitize(35231);

    }

    private static int[] digitize(long n){
        StringBuilder temp = new StringBuilder(String.valueOf(n));
        temp=temp.reverse();
        String reverseText = temp.toString();
        char[] ch = reverseText.toCharArray();
        int[] lastOutput = new int[reverseText.length()];
        for(int i=0;i<reverseText.length();i++){
            lastOutput[i]= Integer.parseInt(String.valueOf(ch[i]));
        }
        return lastOutput;
    }
}
