import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public int countPassengers(ArrayList<int[]> stops) {
        int peopleCount=0;
        for(int[] i:stops){
            for(int j = 0; j<i.length; j++){
                if(j==0){
                    peopleCount+=i[j];
                }else{
                    peopleCount-=i[j];
                }
            }
        }
        return peopleCount;
    }
}
