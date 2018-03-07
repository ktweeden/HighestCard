import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;

    @Before
    public void before() {
        this.player = new Player("Bob");
    }
}
