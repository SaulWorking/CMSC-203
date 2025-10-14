public class Property{
	private String city;
	private String owner;
	private Plot plot;
	private String propertyName;
	private double rentAmount;

	Property(){}
	Property(String propertyName, String city, double rentAmount, String owner){}
	Property(String propertyname, String city, double rentAmoutn, String owner, int x, int y, int width, int depth){}
	//copy constructor
	Property(Property otherProperty){}

	public String getCity(){return city;}
	public String getOwner(){return owner;}
	public Plot getPlot(){return plot;}
	public String getPropertyName(){return propertyName;}
	public double getRentAmount(){return rentAmount;}
	public String toString(){
		return propertyName + "," + city + "," + owner + "," + rentAmount;	
	
	}




}
