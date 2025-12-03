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
	//testSetSize()

    @Test
	//testSetColor()


    @Test
	//testSetBuildingType()

      
    @Test
	//testToString()

    
    
}
