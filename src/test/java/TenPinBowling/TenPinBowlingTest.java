package TenPinBowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenPinBowlingTest {
    @Test
    public void BasicTests() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(20, TenPinBowling.bowling_score("11 11 11 11 11 11 11 11 11 11"));
    }

    @Test
    public void BasicTests2() {
        // assertEquals("expected", "actual");
        System.out.println("Maybe this bowler should put bumpers on...\n ");
        assertEquals(30, TenPinBowling.bowling_score("12 12 12 12 12 12 12 12 12 12"));
    }

    @Test
    public void perfect_game_test() {
        System.out.println("Woah! Perfect game!");
        assertEquals(300, TenPinBowling.bowling_score("X X X X X X X X X XXX"));
    }

    @Test
    public void when_game_has_normal_and_perfect_round_then_score_should_be_correct() {
        assertEquals(133, TenPinBowling.bowling_score("52 X 52 X 52 X 52 X 52 XXX"));
    }
}