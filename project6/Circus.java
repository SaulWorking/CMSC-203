import java.util.ArrayList;
import java.util.List;

public class Circus {
    private List<Animal> animals;
    private List<Person> persons;
    private List<Building> buildings;
    private List<Ticket> tickets;

    public Circus() {
        animals = new ArrayList<>();
        persons = new ArrayList<>();
        buildings = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    // Add building

    // Display building

    // Add person

    // Display person

    // Add animal

    // Display animal using toString() method

    // Selection sort to sort animals by age
    
    // Selection sort to sort animals by name
    
    // Search for an animal by name
    
    // Add ticket

    // Generate ticket
    public Ticket generateTicket(String dayOfWeek, double basePrice, int age) {
        Ticket ticket = new Ticket(dayOfWeek, basePrice, age);  // Pass dayOfWeek, basePrice, age to Ticket constructor
        addTicket(ticket);
        return ticket;
    }
}
