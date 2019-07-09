package AreTheyTheSame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) return false;

        List<Integer> square = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            square.add((int) Math.pow(a[i], 2));
        }
        square.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < b.length; i++) {
            if (square.contains(b[i])) {
                square.remove(square.indexOf(b[i]));
            }
        }

        if (square.isEmpty()) {
            return true;
        }
        return false;
    }
}
