import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTest {

    private Property noobProperty;
    private Property proProperty;
    private Property hackerProperty;

    @BeforeEach
    public void setUp() {
        noobProperty = new Property("John", "New York", 1500.0, "Dad");
        proProperty = new Property("Did", "New World Ork", 2500.0, "impsotor", 10, 20, 50, 60);
        hackerProperty = new Property(noobProperty);
    }



    @Test
    public void testBasicConstructor() {
        assertEquals("John", noobProperty.getPropertyName());
        assertEquals("New York", noobProperty.getCity());
        assertEquals("Dad", noobProperty.getOwner());
        assertEquals(1500.0, noobProperty.getRentAmount());
        assertNotNull(noobProperty.getPlot());
    }

    @Test
    public void testFullConstructor() {
        assertEquals("Did", proProperty.getPropertyName());
        assertEquals("New World Ork", proProperty.getCity());
        assertEquals("impsotor", proProperty.getOwner());
        assertEquals(2500.0, proProperty.getRentAmount());
        assertNotNull(proProperty.getPlot());
        assertEquals(10, proProperty.getPlot().getX());
        assertEquals(20, proProperty.getPlot().getY());
        assertEquals(50, proProperty.getPlot().getWidth());
        assertEquals(60, proProperty.getPlot().getDepth());
    }

    @Test
    public void testCopyConstructor() {
        assertEquals(noobProperty.getPropertyName(), hackerProperty.getPropertyName());
        assertEquals(noobProperty.getCity(), hackerProperty.getCity());
        assertEquals(noobProperty.getOwner(), hackerProperty.getOwner());
        assertEquals(noobProperty.getRentAmount(), hackerProperty.getRentAmount());
        assertNotNull(hackerProperty.getPlot());
    }

    @Test
    public void testToString() {
        assertEquals("John,New York,Dad,1500.0", noobProperty.toString());
        assertEquals("Did,New World Ork,impsotor,2500.0", proProperty.toString());
    }
}