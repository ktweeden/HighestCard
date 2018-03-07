import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {
    Game game;

    @Before
    public void before(){
        this.game = new Game(2);
    }

    @Test
    public void hasTwoPlayers(){
        assertEquals(2, this.game.getPlayers().size());
    }

    @Test
    public void everyoneHasACard() {
        game.deal();
        assertTrue(game.getPlayers().get(0).getHand() != null);
    }

    @Test
    public void winnerIsCorrect() {
        game.getPlayers().get(0).hand = new Card(Suit.CLUBS, Rank.ACE);
        game.getPlayers().get(1).hand = new Card(Suit.DIAMONDS, Rank.FOUR);
        assertEquals(game.getPlayers().get(0), game.findWinner().get(0));
    }

    @Test
    public void resultIsADraw() {
        game.getPlayers().get(0).hand = new Card(Suit.CLUBS, Rank.ACE);
        game.getPlayers().get(1).hand = new Card(Suit.HEARTS, Rank.ACE);
        assertEquals(game.getPlayers(), game.findWinner());
    }

}
