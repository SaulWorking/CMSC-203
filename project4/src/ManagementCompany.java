import java.util.Properties;

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
        this(name, taxID, mgmFeePer,0,0,MGMT_WIDTH, MGMT_DEPTH);
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
        return addProperty(name,city,rent,owner,0,0,0,0);
    }


    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth){
        Property property = new Property(name,city,rent,owner,x,y,width,depth);
        return addProperty(property);
    }


    public int addProperty(Property p){
System.out.println(properties.length);

System.out.println("Full ChecK");


        //if property full
        if(isPropertiesFull()){
            return -1;
        }
System.out.println("EXist ChecK");

        //if not exist
        if(p == null){

            return -2;	
        }
System.out.println("Encompass ChecK");

        //not fleshed out function yet
        if(!this.plot.encompasses(p.getPlot())){

            return -3;	
        }
System.out.println("Overlap ChecK");


            //find available index
            int propIndex = MAX_PROPERTY - 1;

            for(int i=0; i<MAX_PROPERTY; i++){
                if(properties[i] == null){
                    propIndex = i;
                    break;
                }
            }
System.out.println("ADDING PROPERTY CHECK");

        this.properties[propIndex] = new Property(p);	

System.out.println("INCREASE PROPERTY CHECK");

        numberOfProperties++;

            
            //check if THIS property oveerlaps the OTHERs 
            for(int i =0;  i<MAX_PROPERTY-1; i++){
                if(properties[i] != null && i != propIndex){
                    Plot newPlot = this.properties[propIndex].getPlot();
                    Plot plot = properties[i].getPlot();

                    if(newPlot.overlaps(plot)){
                            return -4;
                    }
                }
            }




        System.out.println("number of properties: " + numberOfProperties);


        return propIndex;
    }
 

	


    //g
    public double getTotalRent() {
        double totalRent = 0.0;

            for(int i=0; i<MAX_PROPERTY; i++){
                if(properties[i] != null){
                    totalRent += properties[i].getRentAmount();	
                }
            }
            
        return totalRent;
    }

    //g
    public Property getHighestRentProperty() {

        double highestRent =0.0;
            int propertyNumber = 0;	    

        for(int num = 0; num<MAX_PROPERTY; num++){
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
        int lastProperty = MAX_PROPERTY - 1;
        properties[lastProperty] = null;
        numberOfProperties--;
    }

    public boolean isPropertiesFull() {

    
        if(numberOfProperties == MAX_PROPERTY){
            return true;
        }
        return false;
    }



    public boolean isManagementFeeValid() {

        if(mgmFeePer > 0 && mgmFeePer < 100){
            return true; 
        }
        return false;
    }

    public String toString(){

        double totalManagementFeePer = 0.0;
        String ManagementCompanyInfo = "Management Company: " + name + " Tax ID: " + taxID +"\n\n";

        for(int i =0; i<MAX_PROPERTY; i++){
            if(properties[i] != null){

                ManagementCompanyInfo += "\nProperty:" + (i+1)+"\n\n";

                ManagementCompanyInfo += "Property Name: " + properties[i].getPropertyName()+"\n";
                ManagementCompanyInfo += "City: " + properties[i].getCity()+"\n";
                ManagementCompanyInfo += "Owner: " + properties[i].getOwner()+"\n";
                ManagementCompanyInfo += "Cost of rent: " + properties[i].getRentAmount()+"\n";
            }
        }
                ManagementCompanyInfo += "Total Management Fee: " + totalManagementFeePer;

        return ManagementCompanyInfo;
    }
}
