import java.util.Arrays;

public class CureCancer {
    public static int[] mutationLocation(char[][] body) {
        int row = body.length;
        int tempRow;
        int differentRow = 0;
        int differentCount = 0;
        int[] differentPosition = {};
        for (tempRow = 1; tempRow < row; tempRow++) {
            if (!Arrays.equals(body[0], body[tempRow])) {
                differentCount += 1;
                differentRow = tempRow;
            }
        }

        if (differentCount > 1) {
            for (int i = 0; i < body[0].length; i++) {
                if (body[1][i] != body[0][i]) {
                    differentPosition = new int[]{0, i};
                }
            }
        } else {
            for (int i = 0; i < body[0].length; i++) {
                if (body[0][i] != body[differentRow][i]) {
                    differentPosition = new int[]{differentRow, i};
                }
            }
        }
        return differentPosition;
    }
}
