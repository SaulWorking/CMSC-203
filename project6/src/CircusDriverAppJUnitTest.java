import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CircusDriverAppJUnitTest {
    private Circus circus;

    @BeforeEach
    void setUp() {
        circus = new Circus();
    }

    @Test
    void testAddDog() {
        Dog dog = new Dog("Shila", 3, "Golden Retriever", "Brown");
        circus.addAnimal(dog);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Dog);
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    //testAddBird() 

    @Test
    //testDisplayAnimals() 

    @Test
    //testSortAnimalsByAge() 

    @Test
    //testSortAnimalsByName()

    @Test
    //testSearchAnimalByName() 

     @Test
    //testAddAndDisplayTickets() 
}



