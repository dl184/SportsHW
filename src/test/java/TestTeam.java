import Models.Manager;
import Models.Team;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTeam {

    Team team1;
    Team team2;
    Manager manager1;
    Manager manager2;


    @Before
    public void setUp(){

        manager1 = new Manager("Alex McLeish", 65, "Scottish", 25500);
        manager2 = new Manager("Steven Gerrard", 41, "English", 19500);

        team1 = new Team("Rangers", manager1);
        team2 = new Team("Scotland", manager2);

    }

    @Test
    public void hasName() {
        assertEquals("Rangers", team1.getName());
        assertEquals("Scotland", team2.getName());

    }
}