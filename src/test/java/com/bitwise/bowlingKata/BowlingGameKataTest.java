package com.bitwise.bowlingKata;



        import static org.junit.Assert.*;

        import org.junit.Test;

        import main.java.com.BowlingGame;


public class BowlingGameKataTest {

    @Test
    public void itShouldScoreZeroIfAllTriesAreFail() {

        BowlingGame bowlingGame=new BowlingGame();
        for(int i=0;i<10;i++)
            bowlingGame.roll(0);
        assertEquals(0, BowlingGame.score());
    }

    @Test
    public void scoreIfAllTriesAreOne() {

        BowlingGame bowlingGame=new BowlingGame();
        for(int i=0;i<10;i++)
            bowlingGame.roll(1);
        assertEquals(10, BowlingGame.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        BowlingGame bowlingGame=new BowlingGame();

        rollSpare();
        bowlingGame.roll(3);
        rollMany(17,0);
        assertEquals(16,bowlingGame.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        BowlingGame bowlingGame=new BowlingGame();

        rollStrike();
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24,bowlingGame.score());
    }

    private void rollMany(int n, int pins) {
        BowlingGame bowlingGame=new BowlingGame();

        for (int i = 0; i < n; i++)
            bowlingGame.roll(pins);
    }


    private void rollStrike() {
        BowlingGame bowlingGame=new BowlingGame();

        bowlingGame.roll(10);
    }


    private void rollSpare() {
        BowlingGame bowlingGame=new BowlingGame();

        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }
}
    }


}

}
