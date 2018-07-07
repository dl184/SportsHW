
import Models.Manager;
import Models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTeam {

    Team team1;
    Team team2;


    @Before
    public void setUp(){

        team1 = new Team("Glasgow Rangers", team1.getManager());
        team2 = new Team("Chelsea", team2.getManager());

        }

    @Test
    public void hasName() {
        assertEquals("Glasgow Rangers", team1.getName());
        assertEquals("Chelsea", team2.getName());

    }
}
