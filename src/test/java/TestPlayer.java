import Models.Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPlayer {

    Player player1;
    Player player2;

    @Before
    public void setUp(){
        player1 = new Player("Cristino Ronaldo", 33, "Portuguese", 406000, player1.getSquadNumbers());
        player2 = new Player("Sergio Aguero", 31, "Argentinian", 165000, player2.getSquadNumbers());
        }

    @Test
    public void hasName() {
        assertEquals("Ronaldo", player1.getName());
        assertEquals("Messi", player2.getName());
    }
}
