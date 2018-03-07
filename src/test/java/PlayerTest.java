import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    Player player;
    Card card;

    @Before
    public void before() {
        this.player = new Player();
        this.card = new Card(Suit.HEARTS, Rank.EIGHT);
    }

    @Test
    public void canPickUpCard() {
        this.player.pickUpCard(card);
        assertTrue(player.getHand() != null);
        assertEquals(card, player.getHand());
    }
}
