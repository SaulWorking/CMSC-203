import java.util.Objects;

public class Horse implements Animal {
	
	//instance variables
	private String name;
    private int age;
    private String species;
    private String color;
    
    //constructor
    public Horse(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    @Override
	void move(){
		System.out.println("HORSE MOVE Q3");
	}
	
    @Override
	void makeSound(){
		System.out.println("GALLOP");
	}

    @Override
	String getName(){
		return this.name;
	}
	
    @Override
	int getAge(){
		return this.age;	
	}


		// Check for reference equality
		// Check for null or different class
		// Compare fields for logical equality

    @Override
	boolean equals(Horse horse2){
	
		if(this == horse2){
			return true;
		}

		if(this == null || this.getClass() != horse2.getClass()){
			return false;
		}

		if(this.name == horse2.name && this.age == horse2.age && this.species == horse2.species && this.color == horse2.color){
			return true;
		}
	}
	
    @Override
	String toString(){
		String info = "";
		info = name + ", " + age + ", " + species + ", " + color;
		return info;
	}
    
 
}