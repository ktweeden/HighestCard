import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {
    Game game;
    Card card1;
    Card card2;

    @Before
    public void before(){
        this.game = new Game(2);
        this.card1= new Card(Suit.CLUBS, Rank.ACE);
        this.card2 = new Card(Suit.DIAMONDS, Rank.FOUR);
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
        Player player1 = game.getPlayers().get(0);

        player1.getHand().add(card1);

        game.getPlayers().get(1).hand.add(card2);
        assertEquals(game.getPlayers().get(0), game.findWinner().get(0));
    }

    @Test
    public void resultIsADraw() {

        game.getPlayers().get(0).hand.add(card1);
        game.getPlayers().get(1).hand.add(card1);
        assertEquals(game.getPlayers(), game.findWinner());
    }

}
