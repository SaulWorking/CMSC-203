public class TicketingOffice implements Building {
	//instance variables
    private String color;
    private double length;
    private double width;
    private String buildingType;

    //constructor
    public TicketingOffice(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.buildingType = "Ticketing Office";
    }

    @Override
	//setSize()
    	public void setSize(double length, double width){
		this.length = length;
		this.width = width;	
	}

    @Override
	//getLength()
    	public double getLength(){return this.length;}

    @Override
	//getWidth()
    	public double getWidth(){return this.width;}
    
    @Override
	//setColor()
	public void setColor(String color){
		this.color = color;	
	}

    @Override
	//getColor()
    	public String getColor(){return this.color;}

    @Override
	//setBuildingType()
	public void setBuildingType(String buildingType){
		this.buildingType = buildingType;	
	}

    @Override
	//getBuildingType()
    	public String getBuildingType(){return this.buildingType;}
    
	//toString()
    @Override
    public String toString() {
        return String.format(
            "Building type: %s, Length: %f, Width: %f, Color: %s",
            getBuildingType(), getLength(), getWidth(), getColor()
        );
    }

}
