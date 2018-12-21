import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TVRemoteTest {

    @Test
    public void example() {
        assertEquals(71, Dinglemouse.tvRemote("Too Easy?"));
    }

    @Test
    public void lower() {
//        assertEquals(27,Dinglemouse.tvRemote("Does"));
//        assertEquals(31,Dinglemouse.tvRemote("Your"));
        assertEquals(16, Dinglemouse.tvRemote("does"));
        assertEquals(21, Dinglemouse.tvRemote("your"));
        assertEquals(33, Dinglemouse.tvRemote("solution"));
        assertEquals(18, Dinglemouse.tvRemote("work"));
        assertEquals(12, Dinglemouse.tvRemote("for"));
        assertEquals(27, Dinglemouse.tvRemote("these"));
        assertEquals(23, Dinglemouse.tvRemote("words"));
    }

    @Test
    public void upper() {
        assertEquals(19, Dinglemouse.tvRemote("DOES"));
        assertEquals(22, Dinglemouse.tvRemote("YOUR"));
//        assertEquals(34, Dinglemouse.tvRemote("SOLUTION"));
//        assertEquals(19, Dinglemouse.tvRemote("WORK"));
//        assertEquals(15, Dinglemouse.tvRemote("FOR"));
//        assertEquals(28, Dinglemouse.tvRemote("THESE"));
//        assertEquals(24, Dinglemouse.tvRemote("WORDS"));
    }

    @Test
    public void symbols() {
        assertEquals(33, Dinglemouse.tvRemote("^does^"));
        assertEquals(53, Dinglemouse.tvRemote("$your$"));
        assertEquals(49, Dinglemouse.tvRemote("#solution#"));
        assertEquals(34, Dinglemouse.tvRemote("\u00bfwork\u00bf"));
        assertEquals(38, Dinglemouse.tvRemote("{for}"));
        assertEquals(57, Dinglemouse.tvRemote("\u00a3these\u00a3"));
        assertEquals(54, Dinglemouse.tvRemote("?symbols?"));
    }

}

//if (keyPadMode == 1 && Character.isUpperCase(targetWord[i])) {
//        keyPadMode = 2;
//        int xNormalRoute = Math.abs(5 - startX);
//        int xJumpRoute = Math.abs(startX + keyPadMode1.length - 5);
//        xLength = getxLength(xNormalRoute, xJumpRoute);
//
//        int yNormalRoute = Math.abs(0 - startY);
//        int yJumpRoute = Math.abs(startY + keyPadMode1[0].length - 0);
//        yLength = getyLength(yNormalRoute, yJumpRoute);
//        length += xLength + yLength + 1;
//        startX = 5;
//        startY = 0;
//        }
//
//        if (keyPadMode == 2 && Character.isLowerCase((targetWord[i]))) {
//        keyPadMode = 1;
//        System.out.println("x:" + startX + ",y:" + startY);
//        int xNormalRoute = Math.abs(5 - startX);
//        int xJumpRoute = Math.abs(startX + keyPadMode1.length - 5);
//        xLength = getxLength(xNormalRoute, xJumpRoute);
//
//        int yNormalRoute = Math.abs(0 - startY);
//        int yJumpRoute = Math.abs(startY + keyPadMode1[0].length - 0);
//        yLength = getyLength(yNormalRoute, yJumpRoute);
//        length += xLength + yLength + 2;
//        startX = 5;
//        startY = 0;
//        }