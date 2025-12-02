import java.util.Objects;

public class Dog implements Animal, Cloneable {
    // Instance variables
    private String name;
    private int age;
    protected String species;
    protected String color;

    // Constructor
    public Dog(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    @Override
	void move(){
		System.out.println("DOG MOVE to D14");
	}
	
    @Override
	void makeSound(){
		System.out.println("ROOF");
	}

    @Override
	void getName(){
		return this.name;
	}
	
    @Override
	void getAge(){
		return this.age;	
	}

    @Override
	Dog clone(){
		newDog = new Dog(name,age,species,color);
		return newDog;
	}
		// Check for reference equality
		// Check for null or different class
		// Compare fields for logical equality

    @Override
	boolean equals(Dog dog2){
	
		if(this == null || this.getClass() != dog.getClass()){
			return false;
		}
		if(this == dog2){
			return true;
		}

		if(this.name == dog2.name && this.age == dog2.age && this.species == dog2.species && this.color == dog2.color){
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
