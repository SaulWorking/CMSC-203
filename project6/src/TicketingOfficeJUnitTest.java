import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketingOfficeJUnitTest {

    private TicketingOffice office;

    @BeforeEach
    public void setUp() {
        office = new TicketingOffice("Yellow", 40.0, 20.0);
    }

    @Test
    public void testConstructor() {
        assertEquals("Yellow", office.getColor());
        assertEquals(40.0, office.getLength(), 0.001);
        assertEquals(20.0, office.getWidth(), 0.001);
        assertEquals("Ticketing Office", office.getBuildingType());
    }

    @Test
    public void testSetSize() {
        office.setSize(60.0, 30.0);

        assertEquals(60.0, office.getLength(), 0.001);
        assertEquals(30.0, office.getWidth(), 0.001);
    }

    @Test
    public void testSetColor() {
        office.setColor("Green");

        assertEquals("Green", office.getColor());
    }

    @Test
    public void testSetBuildingType() {
        office.setBuildingType("Office");

        assertEquals("Office", office.getBuildingType());
    }

    @Test
    public void testToString() {
        // Matches corrected toString()
        String expected = "Building type: Ticketing Office, Length: 40.000000, Width: 20.000000, Color: Yellow";
        assertEquals(expected, office.toString());
    }
}