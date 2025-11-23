import java.util.Objects;

public class Lion implements Animal {
	//instance variables
    private String name;
    private int age;
    private String species;
    private String color;

    //constructor
    public Lion(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }
    @Override
	void move(){
		System.out.println("LION MOVE G12");
	}
	
    @Override
	void makeSound(){
		System.out.println("ROAR");
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
	boolean equals(Lion lion2){
	
		if(this == lion2){
			return true;
		}

		if(this == null || this.getClass() != lion2.getClass()){
			return false;
		}

		if(this.name == lion2.name && this.age == lion2.age && this.species == lion2.species && this.color == lion2.color){
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
