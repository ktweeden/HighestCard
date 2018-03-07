public class Deck {

    private Card[] cards;

    public Deck(){
        this.cards = new Card[52];
        this.populateDeck();
    }

    private void populateDeck() {
        int count = 0;
        for (Suit suit: Suit.values()){
            for (Rank rank : Rank.values()){
                this.cards[count] = new Card(suit, rank);
                count ++;
            }
        }
    }

    public int countCards() {
        int count = 0;

        for(int i =0; i< this.cards.length; i++) {
            if(cards[i] != null) {
                count++;
            }
        }

        return count;
    }
}


