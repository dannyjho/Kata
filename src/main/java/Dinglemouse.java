public class Dinglemouse {
    public static int tvRemote(final String words) {
        String[][] keyPadMode1 = new String[][]{
                {"a", "b", "c", "d", "e", "1", "2", "3"},
                {"f", "g", "h", "i", "j", "4", "5", "6"},
                {"k", "l", "m", "n", "o", "7", "8", "9"},
                {"p", "q", "r", "s", "t", ".", "@", "0"},
                {"u", "v", "w", "x", "y", "z", "_", "/"},
                {"aA#", "SP", "", "", "", "", "", ""},
        };

        String[][] keyPadMode3 = new String[][]{
                {"^", "~", "?", "!", "'", "\"", "(", ")"},
                {"-", ":", ";", "+", "&", "%", "*", "="},
                {">", "<", "€", "£", "$", "¥", "¤", "\\"},
                {"[", "]", "{", "}", ",", ".", "@", "§"},
                {"#", "¿", "¡", "", "", "", "_", "/"},
                {"aA#", "SP", "", "", "", "", "", ""}
        };

        int length = 0;
        char[] targetWord = words.toCharArray();
        int startX = 0;
        int startY = 0;
        int xLength;
        int yLength;
        int mode = 1;

        for (int i = 0; i < targetWord.length; i++) {

            if (i == 0 && Character.isUpperCase(targetWord[0])) {
                int[] changeButtonLocation = getTargetWordLocation(keyPadMode1, "aA#");
                xLength = getLength(Math.abs(startX + keyPadMode1.length - changeButtonLocation[0]),
                        startX, changeButtonLocation[0]);
                yLength = getLength(Math.abs(startY + keyPadMode1[0].length - changeButtonLocation[1]),
                        startY, changeButtonLocation[1]);

                length += xLength + yLength + 1;
                startX = changeButtonLocation[0];
                startY = changeButtonLocation[1];
                mode = 2;
            }

            if (mode == 2 && Character.isLowerCase(targetWord[i])) {

                int[] changeButtonLocation = getTargetWordLocation(keyPadMode1, "aA#");
                xLength = getLength(Math.abs(startX + keyPadMode1.length - changeButtonLocation[0]),
                        startX, changeButtonLocation[0]);
                yLength = getLength(Math.abs(startY + keyPadMode1[0].length - changeButtonLocation[1]),
                        startY, changeButtonLocation[1]);
                System.out.println("xLength:" + xLength);

                System.out.println("yLength:" + yLength);
                length += xLength + yLength + 2;
                startX = changeButtonLocation[0];
                startY = changeButtonLocation[1];
                mode = 1;
            }


            int[] location = getTargetWordLocation(keyPadMode1, String.valueOf(targetWord[i]));
//            System.out.println("x:"+location[0]+",y:"+location[1]);
            xLength = getLength(Math.abs(startX + keyPadMode1.length - location[0]), startX, location[0]);
//            System.out.println("xlength:"+xlength);
            yLength = getLength(Math.abs(startY + keyPadMode1[0].length - location[1]), startY, location[1]);
//            System.out.println("ylength:" + ylength);
            startX = location[0];
            startY = location[1];
            length += xLength + yLength;
        }
        length += targetWord.length;
        return length;
    }

    private static int getLength(int abs, int startX, int location) {
        int xlength;
        if (location > startX && abs < location - startX) {
            xlength = abs;
        } else {
            xlength = Math.abs(location - startX);
        }
        return xlength;
    }

    private static int[] getTargetWordLocation(String[][] keyPadMode1, String targetWord) {
        int[] targetWordLocation = new int[2];

        for (int j = 0; j < keyPadMode1.length; j++) {
            for (int k = 0; k < keyPadMode1[0].length; k++) {
                if (targetWord.equals(keyPadMode1[j][k])) {
                    targetWordLocation[0] = j;
                    targetWordLocation[1] = k;
                }
            }
        }
        return targetWordLocation;
    }

}
