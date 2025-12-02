public class Arena implements Building {
    //instance variables
    private String color;
    private double length;
    private double width;
    private String buildingType;

    //constructor
    public Arena(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.buildingType = "Arena";
    }

    @Override
	void setSize(double length, double width){
		this.length = length;
		this.width = width;	
	}

    @Override
	double getLength(){return this.length;}

    @Override
	double getWidth(){return this.width;}
    

    @Override
	void setColor(String color){this.color = color;}

    @Override
	String getColor(){return this.color;}

    @Override
	void setBuildingType(String buildingType){this.buildingType = buildingType;}


    @Override
	String getBuildingType(){return this.buildingType;}
   
    @Override
	String toString(){
		String info = String.format("Building type: %s, length: %f, width: %f, color: %s",buildingType,length,width,color);
		return info;
	}
 
}
