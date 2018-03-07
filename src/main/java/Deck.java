import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        this.populateDeck();
        this.shuffleDeck();
    }

    private void populateDeck() {
        for (Suit suit: Suit.values()){
            for (Rank rank : Rank.values()){
                this.cards.add(new Card(suit, rank));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(this.cards);
    }
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public Card getCard() {
        Random rand = new Random();
        int index = rand.nextInt(52);
        return this.cards.get(index);
    }

    public int countCards() {
        int count = 0;

        for(int i =0; i< this.cards.size(); i++) {
            if(cards.get(i) != null) {
                count++;
            }
        }

        return count;
    }
}


