import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcrobaticJUnitTest {

    @Test
    public void testConstructorAndInheritedGetters() {
        Acrobatic acrobatic = new Acrobatic("Mike Bell", 30, 8, "Trapeze Artist");

        assertEquals("Mike Bell", acrobatic.getName());
        assertEquals(30, acrobatic.getAge());
        assertEquals(8, acrobatic.getYearsWorked());
        assertEquals("Trapeze Artist", acrobatic.getJob());
    }

    @Test
    public void testToString() {
        Acrobatic acrobatic = new Acrobatic("Alice Brown", 35, 12, "Fire Breather");

        String expected = "Name: Alice Brown, age: 35, years worked: 12, job: Fire Breather";

        assertEquals(expected, acrobatic.toString());
    }

}