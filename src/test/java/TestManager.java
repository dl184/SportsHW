import Models.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestManager {

    Manager manager1;
    Manager manager2;

    @Before
    public void setUp(){
        manager1 = new Manager("Antonio Conte", 53, "Italian", 105000);
        manager2 = new Manager("Steven Gerrard", 39, "English", 22500);
        }

    @Test
    public void hasName() {
        assertEquals("Steven Gerrard", manager2.getName());
        assertEquals("Antonio Conte", manager1.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(39,manager2.getAge());
        assertEquals(53, manager1.getAge());
    }

    @Test
    public void hasNationality() {
        assertEquals("English", manager2.getNationality());
        assertEquals("Italian", manager1.getNationality());
    }

    @Test
    public void hasSalary() {
        assertEquals(105000, manager1.getSalary());
        assertEquals(22500, manager2.getSalary());
    }
}
