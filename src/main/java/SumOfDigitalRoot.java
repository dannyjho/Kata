public class SumOfDigitalRoot {
    public static int digital_root(int n) {
        String input ;
        input = Integer.toString(n);
        String text="";
        int output;
        while(input.length()!=1){
            if(text.length()!=1){
                text=input;
                input=calculate(text);
            }else{
                break;
            }
        }
        output = Integer.parseInt(input);
        return output;
    }

    private static String calculate(String input){
        char[] temp = new char[input.length()];
        int tempSum=0;
        String output;
        if(input.length()!=1||input!=null){
            temp = input.toCharArray();
        }

        for(int i=0; i<temp.length;i++){
            tempSum=tempSum+Integer.parseInt(String.valueOf(temp[i]));
        }
        output =Integer.toString(tempSum);
        return output;
    }
}
