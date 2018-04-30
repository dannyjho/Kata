import java.util.ArrayList;

public class WriteNumberInExpandedForm {
    public static void main(String args[]){
        expandedForm(70304);
    }

    public static String expandedForm(int num) {
        String numText = Integer.toString(num);
        String outPut="";
        char[] numChar = numText.toCharArray();
        int numTextLength = numText.length()-1;
        ArrayList<Integer> list = new ArrayList();
        int temp;
        int templist;
        for(int i=0;i<numChar.length;i++){
            int j = (int) Math.pow(10,numTextLength);
            temp =Integer.parseInt(String.valueOf(numChar[i]))*j;
            if(temp!=0&& numTextLength >0){
                templist=Integer.parseInt(String.valueOf(numChar[i]))*j;
                list.add(templist);
            }
            numTextLength--;
        }
        if(num%10!=0){
            list.add(num%10);
        }
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                outPut = outPut+list.get(i);
            }else{
                outPut = outPut+list.get(i)+" + ";
            }
        }
        System.out.println(outPut);
        return outPut;
    }
}
