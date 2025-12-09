import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClerkJUnitTest {

    @Test
    public void testConstructorAndInheritedGetters() {
        Clerk clerk = new Clerk("John Brown", 35, 10, "Office Manager");

        assertEquals("John Brown", clerk.getName());
        assertEquals(35, clerk.getAge());
        assertEquals(10, clerk.getYearsWorked());
        assertEquals("Office Manager", clerk.getJob());
    }

    @Test
    public void testToString() {
        Clerk clerk = new Clerk("John Brown", 35, 10, "Office Manager");

        String expected = "Name: John Brown, age: 35, years worked: 10, job: Office Manager";

        assertEquals(expected, clerk.toString());
    }
}