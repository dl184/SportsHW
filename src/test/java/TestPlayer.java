import Models.Player;
import Models.SquadNumber;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPlayer {

    Player player1;
    Player player2;

    @Before
    public void setUp() {
        player1 = new Player("Ronaldo", 33, "Portuguese", 406000, SquadNumber.EIGHT);
        player2 = new Player("Sergio Aguero", 31, "Argentinian", 165000, SquadNumber.NINETEEN);
        }

    @Test
    public void hasName() {
        assertEquals("Ronaldo", player1.getName());
        assertEquals("Sergio Aguero", player2.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(33, player1.getAge());
        assertEquals(31, player2.getAge());
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

    @Test
    public void hasSquadNumber() {
        assertEquals(SquadNumber.EIGHT, player1.getSquadNumbers());
        assertEquals(SquadNumber.NINETEEN, player2.getSquadNumbers());
    }
}
