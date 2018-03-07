import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(int numberOfPlayers){
        this.deck = new Deck();
        this.players = new ArrayList<>();
        generatePlayers(numberOfPlayers);
    }

    private void generatePlayers(int numberOfPlayers){
        for (int i=0; i<numberOfPlayers; i++){
            this.players.add(new Player());
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


}
