public class BitCounting {
    public static int countBits(int n) {
        int counts = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                counts++;
            n >>= 1;
        }

        return counts;
    }
}
