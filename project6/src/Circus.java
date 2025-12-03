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
    void sortAnimalsByAge(){
	  for(int i = 0; i<animals.size()-1;i++)
	  {
		int min_index = i;

      for(int j =i+1; j<animals.size();j++)
      {
        int animal1age = animals.get(j).getAge(); 
        int animal2age = animals.get(min_index).getAge();	

              if(animal1age <  animal2age)
              {
                min_index = j;
              } 
      
      }
	  
  //      int temp = animals.get(j).getAge();
   //   animals.get(j).setAge(animals.get(min_index).getAge());
   //   animals.get(min_index).setAge(temp);
	  }
    }

    
    // Selection sort to sort animals by name
    
    void sortAnimalByName(){
    List<Animal> sortedAnimals = new ArrayList<>(animals);

	  for(int i = 0; i<animals.size()-1;i++)
	  {
          int min_index = i;

          for(int j =i+1; j<animals.size();j++)
          {

                  String animal1name = animals.get(j).getName(); 
                  String animal2name = animals.get(min_index).getName();	
                  if(animal1name.compareTo(animal2name) < 0)
                  {
                    min_index = j;
                  } 
                
          }
          
	  	  String temp = sortedAnimals.get(i).getName();
        sortedAnimals.get(i).getName().replace(sortedAnimals.get(i).getName(), sortedAnimals.get(min_index).getName());
        sortedAnimals.get(min_index).getName().replace(sortedAnimals.get(min_index).getName(), temp);
	  }

      System.out.println("Animals sorted by name:");
      for (Animal animal : sortedAnimals) {
          System.out.println(animal.toString());
      }
    }
    // Search for an animal by name
    int searchAnimalName(Animal animal){
        return this.animals.indexOf(animal);
    }

    // Add ticket

    void addTicket(Ticket ticket){
    	this.tickets.add(ticket);
    }

    // Generate ticket
    public Ticket generateTicket(String dayOfWeek, double basePrice, int age) {
        Ticket ticket = new Ticket(dayOfWeek, basePrice, age);  // Pass dayOfWeek, basePrice, age to Ticket constructor
        return ticket;
    }
}
