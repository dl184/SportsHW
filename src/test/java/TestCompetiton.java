import Models.Competition;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TestCompetiton {

    Competition competition1;
    Competition competition2;

    @Before
    public void setUp() {
        competition1 = new Competition("Uefa Champions League");
        competition2 = new Competition("FA Cup");
    }

    @Test
    public void hasName() {
        assertEquals("Uefa Champions League", competition1.getName());
        assertEquals("FA Cup", competition2.getName());
    }

}