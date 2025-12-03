import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BirdJUnitTest {

    private Bird bird;

    @BeforeEach
    public void setUp() {
        bird = new Bird("Tweety", 2, "Canary", "Yellow");
    }

    @Test
    public void testGetName() {
        assertEquals("Tweety", bird.getName());
    }


    @Test
    public void testEqualsWithSameAttributes() {
        Bird sameBird = new Bird("Tweety", 2, "Canary", "Yellow");
        assertEquals(bird, sameBird);
    }

    @Test
    public void testNotEqualsWithDifferentName() {
        Bird different = new Bird("Polly", 2, "Canary", "Yellow");
        assertNotEquals(bird, different);
    }

}
