import java.util.Objects;

public class Bird implements Animal, Cloneable {
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
	public void move(){
		System.out.println("Bird moves D12");
	}
    
    @Override
	public void makeSound(){
		System.out.println("TWEET TWEET, TWEET TWEET");
	}
	
    @Override
	    public String getName(){return this.name;}

    @Override
	    public int getAge(){return this.age;}
	
   @Override
	public Bird clone(){
		Bird newBird = new Bird(name,age,species,color);
		return newBird;
	}
	// Check for reference equality
	// Check for null or different class
	// Compare fields for logical equality
	public boolean equals(Object obj){

    Bird bird2 = (Bird) obj;
		
		if(this == null || this.getClass() != bird2.getClass()){
			return false;
		}

		if(this == bird2){
			return true;
		}

		
		if(this.name == bird2.name && this.age == bird2.age && this.species == bird2.species && this.color == bird2.color){
			return true;
		}

		//IF NOT TRUE
		return false;	
	}

	
    @Override
	public String toString(){
		String info = String.format("Name: %s, age: %d, species: %s, color: %s",name,age,species,color);
		return info;
	}
  
}
