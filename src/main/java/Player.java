public class Player {

    Card hand;

    public Player(){

    }

    public Card getHand() {
        return this.hand;
    }

    public void pickUpCard(Card card) {
        this.hand = card;
    }
}
