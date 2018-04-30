public class MergedStringChecker {
    public static boolean isMerge(String s, String part1, String part2) {
       if(s.length()!=part1.length()+part2.length()){
           return false;
       }

       StringBuilder answer =new StringBuilder(s);
       StringBuilder partOne = new StringBuilder(part1);
       StringBuilder partTwo = new StringBuilder(part2);

       while (answer.length()>0){
           int lengthPart1=0;
           int lengthPart2=0;

           for(int i=0;i<partOne.length();i++){
               if(answer.charAt(i)==partOne.charAt(i)){
                   lengthPart1++;
               }else {
                   break;
               }
           }

           for(int i=0;i<partTwo.length();i++){
               if(answer.charAt(i)==partTwo.charAt(i)){
                   lengthPart2++;
               }else {
                   break;
               }
           }

           if(lengthPart1==0&&lengthPart2==0){
               return false;
           }

           if (lengthPart1>lengthPart2){
               partOne.delete(0,1);
               answer.delete(0,1);
           }else{
               partTwo.delete(0,1);
               answer.delete(0,1);
           }
       }
       if(answer.length()==0&&partOne.length()==0&&partTwo.length()==0){
           return true;
       }else {
           return false;
       }
    }
}
