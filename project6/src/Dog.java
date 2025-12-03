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
	public void move(){
		System.out.println("DOG MOVE to D14");
	}
	
    @Override
	public void makeSound(){
		System.out.println("ROOF");
	}

    @Override
	public String getName(){
		return this.name;
	}
	
    @Override
	public int getAge(){
		return this.age;	
	}

    @Override
	public Dog clone(){
		Dog newDog = new Dog(name,age,species,color);
		return newDog;
	}
		// Check for reference equality
		// Check for null or different class
		// Compare fields for logical equality

    @Override
	public boolean equals(Object obj){

		Dog dog2 = (Dog) obj;

		if(this == null || this.getClass() != dog2.getClass()){
			return false;
		}
		if(this == dog2){
			return true;
		}

		if(this.name == dog2.name && this.age == dog2.age && this.species == dog2.species && this.color == dog2.color){
			return true;
		}
		//IF NOT EQUAL
		return false;
	}
	
    @Override
	public String toString(){
		String info = "";
		info = name + ", " + age + ", " + species + ", " + color;
		return info;
	}
    
}    
