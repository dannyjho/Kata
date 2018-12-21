package TenPinBowling;


import java.util.Arrays;
import java.util.List;

public class TenPinBowling {
    public static int bowling_score(String frames) {
        int totalScore = 0;
        List<String> rounds = Arrays.asList(frames.split(" "));
        int roundScore1st = 0;
        int roundScore2nd = 0;
        boolean doubleFlag = false;
        for (int i = 0; i < rounds.size(); i++) {
            List<String> roundScore = Arrays.asList(rounds.get(i).split(""));
            if (roundScore.size() == 2) {
                roundScore1st = Integer.parseInt(roundScore.get(0));
                roundScore2nd = Integer.parseInt(roundScore.get(1));
                if (doubleFlag) {
                    totalScore = totalScore + (roundScore1st + roundScore2nd) * 2;
                } else {
                    totalScore = totalScore + roundScore1st + roundScore2nd;
                }
            }

            if (roundScore.size() == 1) {
                totalScore = totalScore + 10;
                doubleFlag = true;
            }


            if (roundScore.size() == 3) {
                for (int j = 0; j < roundScore.size(); j++) {
                    if (roundScore.get(j).equals("X")) {
                        totalScore = totalScore + 10;
                    }
                }
            }
            System.out.println(i + ":" + totalScore);


        }
        return totalScore;
    }
}
