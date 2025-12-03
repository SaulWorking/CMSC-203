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
	public void move(){
		System.out.println("LION MOVE G12");
	}
	
    @Override
	public void makeSound(){
		System.out.println("ROAR");
	}

    @Override
	public String getName(){
		return this.name;
	}
	
    @Override
	public int getAge(){
		return this.age;	
	}


		// Check for reference equality
		// Check for null or different class
		// Compare fields for logical equality

    @Override
	public boolean equals(Object obj){
	
		Lion lion2 = (Lion) obj;

		if(this == lion2){
			return true;
		}

		if(this == null || this.getClass() != lion2.getClass()){
			return false;
		}

		if(this.name == lion2.name && this.age == lion2.age && this.species == lion2.species && this.color == lion2.color){
			return true;
		}

		//IF NOT TRUE
		return false;
	}
	
    @Override
	public String toString(){
		String info = "";
		info = name + ", " + age + ", " + species + ", " + color;
		return info;
	}
    
 

}
