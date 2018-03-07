import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(int numberOfPlayers){
        this.deck = new Deck();
        this.players = new ArrayList<>();
        generatePlayers(numberOfPlayers);
    }

    public void play(){
        deal();
        findWinner();
    }

    private void generatePlayers(int numberOfPlayers){
        for (int i=0; i<numberOfPlayers; i++){
            this.players.add(new Player());
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


    public void deal() {
        for (Player player : this.players){
            player.pickUpCard(this.deck.getCard());
        }
    }

    public ArrayList<Player> findWinner() {
        int highest = 0;
        ArrayList<Player> winners = new ArrayList<>();
        for (Player player : this.players){
            if(player.valueOfHand() > highest) {
                highest = player.valueOfHand();
                winners.clear();
                winners.add(player);
            }
            else if(player.valueOfHand() == highest) {
                winners.add(player);
            }
        }
        return winners;
    }
}
