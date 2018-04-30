import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> direction = new ArrayList<String>(Arrays.asList(arr));

        while(true){
            int length = direction.size();
            for (int i = 0; i < direction.size()-1; i++) {
                if ("NORTH".equals(direction.get(i)) && "SOUTH".equals(direction.get(i+1)) ||
                        "SOUTH".equals(direction.get(i)) && "NORTH".equals(direction.get(i+1)) ||
                        "EAST".equals(direction.get(i)) && "WEST".equals(direction.get(i+1)) ||
                        "WEST".equals(direction.get(i)) && "EAST".equals(direction.get(i+1))) {
                    direction.remove(i);
                    direction.remove(i);
                    break;
                }
            }
            if(length == direction.size()){
                break;
            }
        }

        return direction.toArray(new String[0]);
    }
}
