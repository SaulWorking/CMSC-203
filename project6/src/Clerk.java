public class Clerk extends Person {
    private String job;

    public Clerk(String name, int age, int yearsWorked, String job) {
	super(name,age,yearsWorked);
	this.job = job;
    }
    public String getJob() {
	return this.job;        
    }

    
    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, years worked: %d, job: %s",getName(),getAge(),getYearsWorked(),job);      
    }   
     
}
