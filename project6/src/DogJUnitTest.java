import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogJUnitTest {

    private Dog dog;

    @BeforeEach
    public void setUp() {
        dog = new Dog("Buddy", 5, "Labrador", "Brown");
    }

    @Test
    public void testGetAge() {
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testEqualsSameFields() {
        Dog anotherDog = new Dog("Buddy", 5, "Labrador", "Brown");
        assertEquals(dog, anotherDog);
    }

}
