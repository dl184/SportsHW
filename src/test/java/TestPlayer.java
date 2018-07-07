import Models.Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPlayer {

    Player player1;
    Player player2;

    @Before
    public void setUp() {
        player1 = new Player("Cristino Ronaldo", 33, "Portuguese", 406000, player1.getSquadNumbers());
        player2 = new Player("Sergio Aguero", 31, "Argentinian", 165000, player2.getSquadNumbers());
        }

    @Test
    public void hasName() {
        assertEquals("Ronaldo", player1.getName());
        assertEquals("Messi", player2.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(33, player1.getAge());
        assertEquals(21, player2.getAge());
    }

    @Test
    public void hasNationality() {
        assertEquals("Portuguese", player1.getNationality());
        assertEquals("Argentinian", player2.getNationality());
    }

    @Test
    public void hasSalary() {
        assertEquals(406000, player1.getSalary());
        assertEquals(165000, player2.getSalary());
    }

//    @Test
//    public void hasSquadNumber() {
//        assertEquals(player1, player1.getSquadNumbers());
//        assertEquals(player2, player2.getSquadNumbers());
//    }
}
