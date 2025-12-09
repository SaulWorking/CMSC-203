import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaJUnitTest {

    private Arena arena;

    @BeforeEach
    public void setUp() {
        arena = new Arena("Blue", 100.0, 50.0);
    }

    @Test
    public void testConstructorAndInitialValues() {
        assertEquals("Blue", arena.getColor(), "Initial color is incorrect.");
        assertEquals(100.0, arena.getLength(), 0.001, "Initial length is incorrect.");
        assertEquals(50.0, arena.getWidth(), 0.001, "Initial width is incorrect.");
        assertEquals("Arena", arena.getBuildingType(), "Initial building type is incorrect.");
    }

    @Test
    public void testSetSize() {
        arena.setSize(200.0, 75.0);

        assertEquals(200.0, arena.getLength(), 0.001);
        assertEquals(75.0, arena.getWidth(), 0.001);
    }

    @Test
    public void testSetColor() {
        arena.setColor("Red");

        assertEquals("Red", arena.getColor());
    }

    @Test
    public void testSetBuildingType() {
        arena.setBuildingType("Stadium");

        assertEquals("Stadium", arena.getBuildingType());
    }

    @Test
    public void testToString() {
        String expected = "Building type: Arena, length: 100.000000, width: 50.000000, color: Blue";
        assertEquals(expected, arena.toString());
    }

}