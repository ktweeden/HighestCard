import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;


    @Before
    public void before() {
        this.deck = new Deck();
    }

    @Test
    public void deckIsPopulatedTest(){
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canGetARandomCard() {
        Card card = this.deck.getCard();
        assertTrue(this.deck.getCards().contains(card));
    }
}
