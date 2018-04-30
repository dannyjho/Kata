public class DontEatTheLastCake {
    public DontEatTheLastCake(int cakes) {
    }
    // Decide who move first - player or opponent (true if player)
    public boolean firstMove(int cakes) {
        // I wish to move first
        if(cakes>2&&cakes%4!=2){
            return true;
        }
        return false;
    }

    // Decide your next move
    public int move(int cakes, int last) {
        // I'm not greedy
        return cakes % 4 < 3 ? 3 : 1;
    }
}
