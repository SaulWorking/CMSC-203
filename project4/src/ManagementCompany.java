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


public class ManagementCompany {

    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_DEPTH = 10;
    public static final int MGMT_WIDTH = 10;
    

    private String name;
    private String taxID;
    private double mgmFeePer;
    private int numberOfProperties;
    private Plot plot;
    private Property[] properties;



    public ManagementCompany() {
        name = "";
        taxID = "";
        mgmFeePer = 0;
        numberOfProperties = 0;
                        //plot coordinates & size
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this(name, taxID, mgmFeePer,1,1,MGMT_WIDTH, MGMT_DEPTH);
    }

    public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
                            //plot coordinates & size
        this.plot = new Plot(x, y, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
    }

    public ManagementCompany(ManagementCompany otherCompany) {

        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.numberOfProperties = otherCompany.numberOfProperties;
        this.plot = new Plot(otherCompany.plot); 
        this.properties = new Property[MAX_PROPERTY];
        for (int i = 0; i < otherCompany.properties.length; i++) {
            if (otherCompany.properties[i] != null) {
                this.properties[i] = new Property(otherCompany.properties[i]);
            }
        }
    }

  
    public double getMgmFeePer() {return mgmFeePer;}
    public String getName() {return name;}
    public int getNumberOfProperties() {return numberOfProperties;}
    public Plot getPlot() {return plot;}
    public Property[] getProperties() {return properties;}
    public String getTaxID() {return taxID;}

	
    
    
    public int addProperty(String name, String city, double rent, String owner){
        return addProperty(name,city,rent,owner,0,0,1,1);
    }


    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth){
        Property property = new Property(name,city,rent,owner,x,y,width,depth);
        return addProperty(property);
    }


    public int addProperty(Property p){



        //if property full
        if(isPropertiesFull()){
            return -1;
        }

        //if not exist
        if(p == null){

        	
            return -2;	
        }

        if(!this.plot.encompasses(p.getPlot())){
            return -3;	
        }


            //find available index
            int propIndex = 0;

            for(int i=0; i<numberOfProperties; i++){
                if(properties[i] == null){
                    propIndex = i;
                    break;
                }
            }

        this.properties[propIndex] = new Property(p);	


        numberOfProperties++;
            
            //check if THIS NEW property oveerlaps the OTHERs 
            for(int i =0;  i<numberOfProperties; i++){
                if(properties[i] != null && i != propIndex){
                    Plot newPlot = this.properties[propIndex].getPlot();
                    Plot plot = this.properties[i].getPlot();

                    if(newPlot.overlaps(plot)){
                            return -4;
                    }	
                }
            }
            
        return propIndex;
    }

    //g
    public double getTotalRent() {
        double totalRent = 0.0;

            for(int i=0; i<numberOfProperties; i++){
                if(properties[i] != null){
                    totalRent += properties[i].getRentAmount();	
                    System.out.println(i);
                }
            }
            
        return totalRent;
    }

    //g
    public Property getHighestRentProperty() {

        double highestRent =0.0;
            int propertyNumber = 0;	    

        for(int num = 0; num<numberOfProperties; num++){
            if(properties[num] != null){
                double currentRent = properties[num].getRentAmount();
            if(currentRent > highestRent){
                highestRent = currentRent;
                propertyNumber = num;
            }	
        }
	}	
	
	//we do not want a reference to properties[num]
        return new Property(properties[propertyNumber]);
    }

    public void removeLastProperty() {
    	
    	int lastIndex = 0;

        for(int i=0; i<numberOfProperties; i++){
            if(properties[i] != null){
            	lastIndex = i;

            }
        }
        
        numberOfProperties--;
    
        properties[lastIndex] = null;
    }

    public boolean isPropertiesFull() { 

        if(numberOfProperties == MAX_PROPERTY){
            return true;
        }
        return false;
    }

    public int getPropertiesCount() {
    	return numberOfProperties;
    }


    public boolean isManagementFeeValid() {

        if(mgmFeePer > 0 && mgmFeePer < 100){
            return true; 
        }
        return false;
    }

    public String toString(){

        double totalManagementFeePer = 0.0;
        double rate = mgmFeePer/100;
        
		String ManagementCompanyInfo = "List of the properties for " + name + ", taxID: " + taxID + "\n"; 

			   ManagementCompanyInfo += "______________________________________________________";
				
        for(int i =0; i<MAX_PROPERTY; i++){
            if(properties[i] != null){
            	
            	ManagementCompanyInfo +='\n' + 
            							properties[i].getPropertyName()+ "," + 
										properties[i].getCity()+"," +
										properties[i].getOwner()+"," + 
										properties[i].getRentAmount();
										
            	totalManagementFeePer += properties[i].getRentAmount() * rate;
            }
        }	
			
 			  ManagementCompanyInfo += "\n______________________________________________________\n\n";
              ManagementCompanyInfo += " total management Fee: " + totalManagementFeePer;

        return ManagementCompanyInfo;
    }
}
