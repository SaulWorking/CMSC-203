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
    
    void addBuilding(Building building){
    	this.buildings.add(building);
    }


    // Display building
    void displayBuilding(Building building){
	    System.out.println(building);
    }

    // Add person
    void addPerson(Person person){
    	this.persons.add(person);
    }

    // Display person
    void displayPerson(Person person){
    	System.out.println(person);
    }

    // Add animal
    void addAnimal(Animal animal){
    	this.animals.add(animal);
    }

    // Display animal using toString() method
    void displayAnimal(Animal animal){
    	System.out.println(animal.toString());
    }

    // Selection sort to sort animals by age
    void sortAnimalAge(){
	  for(int i = 0; i<animals.size()-1;i++){
	  
	  
	  
	  }
    }

    
    // Selection sort to sort animals by name
    
    void sortAnimalName(){
	  for(int i = 0; i<animals.size()-1;i++){
	  
	  
	  
	  }
    }
    // Search for an animal by name
    int searchAnimalName(Animal animal){
	 return this.animals.indexOf(animal) 
    }

    // Add ticket

    void addTicket(Ticket ticket){
    	this.tickets.add(ticket);
    }

    // Generate ticket
    public Ticket generateTicket(String dayOfWeek, double basePrice, int age) {
        Ticket ticket = new Ticket(dayOfWeek, basePrice, age);  // Pass dayOfWeek, basePrice, age to Ticket constructor
        addTicket(ticket);
        return ticket;
    }
}
