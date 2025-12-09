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
    
    public List<Animal> getAnimals(){
    	return animals;
    }

    // Add building
    
    void addBuilding(Building building){
    	this.buildings.add(building);
    }


    // Display building
    void displayAllBuildings(){
    	for (Building building : buildings) {
            System.out.println(building.toString());
        }
    }

    // Add person
    void addPerson(Person person){
    	this.persons.add(person);
    }

    // Display person
    void displayAllPersons(){
    	for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    // Add animal
    void addAnimal(Animal animal){
    	this.animals.add(animal);
    }

    // Display animal using toString() method
    void displayAllAnimals(){
    	for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
    

    // Selection sort to sort animals by age
void sortAnimalsByAge() {
    List<Animal> sortedAge = new ArrayList<>(animals); 
    for (int i = 0; i < sortedAge.size() - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < sortedAge.size(); j++) {
            if (sortedAge.get(j).getAge() < sortedAge.get(minIndex).getAge()) {
                minIndex = j;
            }
        }

        Animal temp = sortedAge.get(i);
        sortedAge.set(i, sortedAge.get(minIndex));
        sortedAge.set(minIndex, temp);
    }

    for (Animal animal : sortedAge) {
        System.out.println(animal);
    }
}

    
    // Selection sort to sort animals by name
    
void sortAnimalsByName() {
    List<Animal> sortedName = new ArrayList<>(animals);

    for (int i = 0; i < sortedName.size() - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < sortedName.size(); j++) {
            String name1 = sortedName.get(j).getName();
            String name2 = sortedName.get(minIndex).getName();

            if (name1.compareToIgnoreCase(name2) < 0) {
                minIndex = j;
            }
        }

        Animal temp = sortedName.get(i);
        sortedName.set(i, sortedName.get(minIndex));
        sortedName.set(minIndex, temp);
    }

    for (Animal animal : sortedName) {
        System.out.println(animal.getName());
    }
}
    // Search for an animal by name
void searchAnimalByName(String name) {
    if (name == null || name.isEmpty()){
        return;
    }

    String lookup = name.trim().toLowerCase();

    for (Animal animal : animals) {
        String animalName = animal.getName().trim().toLowerCase();

        if (animalName.equals(lookup)) {
            System.out.println(animal);
        }
    }
}

    // Add ticket
    void addTicket(Ticket ticket){
    	this.tickets.add(ticket);
    }

    // Generate ticket
    public Ticket generateTicket(String dayOfWeek, double basePrice, int customerType) {
	    int age = 0;
	if(customerType ==1){
		age = 11;	
	}else if(customerType == 2){
		age = 22;	
	}else if(customerType == 3){
		age = 33;
	}else if(customerType == 4){
		age = 66;
	}

        Ticket ticket = new Ticket(dayOfWeek, basePrice, age);  // Pass dayOfWeek, basePrice, age to Ticket constructor
        return ticket;
    }
}
