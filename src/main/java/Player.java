import java.util.ArrayList;

public class Player {

    ArrayList<Card> hand;

    public Player(){

        this.hand = new ArrayList<>();

    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void pickUpCard(Card card) {
        this.hand.add(card);
    }

    public int valueOfHand(){
        int value = 0;
        for (Card card : this.hand){
            value += card.getValue();
        }
        return value;
    }
}
