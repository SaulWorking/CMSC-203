import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CircusDriverAppJUnitTest {

    private Circus circus;

    @BeforeEach
    public void setUp() {
        circus = new Circus();
    }

    @Test
    public void testAddDog() {
        Dog dog = new Dog("Shila", 3, "Golden Retriever", "Brown");
        circus.addAnimal(dog);
        List<Animal> animals = circus.getAnimals();

        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Dog);
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    public void testAddBird() {
        Bird bird = new Bird("Sky", 2, "John", "Blue");
        circus.addAnimal(bird);
        List<Animal> animals = circus.getAnimals();

        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Bird);
        assertEquals("Sky", animals.get(0).getName());
    }

    @Test
    public void testAddHorse() {
        Horse horse = new Horse("Spirit", 5, "Arabian", "Black");
        circus.addAnimal(horse);
        List<Animal> animals = circus.getAnimals();

        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Horse);
        assertEquals("Spirit", animals.get(0).getName());
    }

    @Test
    public void testAddLion() {
        Lion lion = new Lion("Simba", 4, "African", "Golden");
        circus.addAnimal(lion);
        List<Animal> animals = circus.getAnimals();

        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Lion);
        assertEquals("Simba", animals.get(0).getName());
    }

    @Test
    public void testDisplayAnimals() {
        circus.addAnimal(new Dog("Shila", 3, "Golden Retriever", "Brown"));
        circus.addAnimal(new Bird("Sky", 2, "Dad", "Blue"));

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));


        String output = out.toString();
        assertTrue(output.contains("Shila"));
        assertTrue(output.contains("Sky"));
    }

    @Test
    public void testSortAnimalsByAge() {
        circus.addAnimal(new Dog("Shila", 3, "Golden Retriever", "Brown"));
        circus.addAnimal(new Dog("Bingo", 1, "Beagle", "White"));

        circus.sortAnimalsByAge();
        List<Animal> animals = circus.getAnimals();

        assertEquals("Bingo", animals.get(1).getName());
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    public void testSortAnimalsByName() {
        circus.addAnimal(new Dog("Zara", 4, "Poodle", "Black"));
        circus.addAnimal(new Dog("Amy", 2, "Husky", "Gray"));

        circus.sortAnimalsByName();
        List<Animal> animals = circus.getAnimals();

        assertEquals("Amy", animals.get(1).getName());
        assertEquals("Zara", animals.get(0).getName());
    }

    @Test
    public void testSearchAnimalByName() {
        circus.addAnimal(new Dog("Shila", 3, "Golden Retriever", "Brown"));

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        circus.searchAnimalByName("Shila");
        String output = out.toString();

        assertTrue(output.contains("Shila"));
    }

    @Test
    public void testAddAndDisplayTickets() {
        Ticket t1 = new Ticket("Bob", 25.00, 10);
        Ticket t2 = new Ticket("Alice", 30.00, 10);

        circus.addTicket(t1);
        circus.addTicket(t2);

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));


        String output = out.toString();

        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Bob"));
    }
}