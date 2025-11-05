/*
 * Class: CMSC203 
 * Instructor: Huseyin Agyun
 * Description: (Give a brief description for each Class)
 * Due: 10/28/2025
 * Platform/compiler: JDK 21
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Thien Dinh 
*/


public class Property {

    private String city;
    private String owner;
    private Plot plot;
    private String propertyName;
    private double rentAmount;

    public Property() {
        propertyName = "";
        city = "";
        owner = "";
        rentAmount = 0;
        plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(Property otherProperty) {
        this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.rentAmount = otherProperty.rentAmount;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot);
    }


    public String getCity() {return city;}
    public String getOwner() {return owner;}
    public Plot getPlot() {return plot;}
    public String getPropertyName() {return propertyName;}
    public double getRentAmount() {return rentAmount;}


    public String toString(){
        String propertyInfo = propertyName + "," + 
                              city + "," + 
                              owner + "," + 
                              rentAmount;
        return propertyInfo;
    }
}