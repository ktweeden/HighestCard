import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
