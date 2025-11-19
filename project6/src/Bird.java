import java.util.Objects;

public class Bird implements Animal {
	//instance variables
    private String name;
    private int age;
    private String species;
    private String color;

    //constructor
    public Bird(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    @Override
	void move(){
		System.out.println("Bird moves D12");
	}
    
    @Override
	void makeSound(){
		System.out.println("TWEET TWEET, TWEET TWEET");
	}
	
    @Override
	    String getName(){return this.name;}

    @Override
	    int getAge(){return this.age;}
	
    @Override

	// Check for reference equality
	// Check for null or different class
	// Compare fields for logical equality
	boolean equals(Bird bird2){

		if(this == bird2){
			return true;
		}

		if(this != null || this.getClass() == bird2.getClass(){
			return true;
		}
		
		if(this.name == bird2.name && this.age == bird2.age && this.species == bird2.species && this.color == bird2.color){
			return true;
		}

	
	}

	
    @Override
	String toString(){
		String info = String.format("Name: %s, age: %d, species: %s, color: %s",name,age,species,color);
		return info;
	}
  
}
