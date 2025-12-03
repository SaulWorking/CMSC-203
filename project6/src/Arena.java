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
	public void setSize(double length, double width){
		this.length = length;
		this.width = width;	
	}

    @Override
	public double getLength(){return this.length;}

    @Override
	public double getWidth(){return this.width;}
    

    @Override
	public void setColor(String color){this.color = color;}
    @Override
	public String getColor(){return this.color;}

    @Override
	public void setBuildingType(String buildingType){this.buildingType = buildingType;}


    @Override
	public String getBuildingType(){return this.buildingType;}
   
    @Override
	public String toString(){
		String info = String.format("Building type: %s, length: %f, width: %f, color: %s",buildingType,length,width,color);
		return info;
	}
 
}
