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
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.numberOfProperties = 0;
                            //plot coordinates & size
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.numberOfProperties = 0;
                            //plot coordinates & size
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
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

    public void setMgmFeePer(double mgmFeePer) {this.mgmFeePer = mgmFeePer;}
    public void setName(String name) {this.name = name;}
    public void setNumberOfProperties(int numberOfProperties) {this.numberOfProperties = numberOfProperties;}
    public void setPlot(Plot plot) {this.plot = plot;}
    public void setProperties(Property[] properties) {this.properties = properties;}
    public void setTaxID(String taxID) {this.taxID = taxID;}

	

    
    public int addProperty(String name, String city, double rent, String owner){
	 this(name, city, rent, owner, 0, 0, 0, 0);
        return 1;
    }


    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth){

   	return 1; 
    }

    public int addProperty(Property p){
	if(p == null){
		return -2;	
	}

	if(isPropertiesFull()){
		return	-1;
	}
	//not fleshed out function yet
	if(!(this.plot.encompasses(p.getPlot())){
		return -3;	
	}
	
	int propertyNum = getPropertiesCount() + 1;

	//we make a new copy instead of referencing the given property.	
	properties[propertyNum] = new Property(p);	
	

    }

    public double getTotalRent() {
	double totalRent = 0.0;

	for(int i=0; i<MAX_PROPERTY; i++){
		totalRent += properties[i].getRentAmount();	
	}
	
        return totalRent;
    }

    public Property getHighestRentProperty() {

	double highestRent =0.0;
    	int propertyNumber = 0;	    

	for(int num = 0; num<MAX_PROPERTY; num++){
		double currentRent = properties[num].getRentAmount();
		if(currentRent > highestRent){
			highestRent = currentRent;
			propertyNumber = num;
		}	
	}	
	
	//we do not want a reference to properties[num]
        return new Property(properties[i]);
    }

    public void removeLastProperty() {
	int lastProperty = MAX_PROPERTY - 1;
	propreties[lastProperty] = null;
    }

    public boolean isPropertiesFull() {

	boolean isFull = (getPropertiesCount() == MAX_PROPERTY) ? true : false
	return isFull;
    }

    public int getPropertiesCount() {

	int counter = 0;
	for(int i=0; i<MAX_PROPERTY; i++){
		if(properties[i] != null){
			counter++;
		}	
	}
        return counter;
    }

    public boolean isManagementFeeValid() {
        return false;
    }

    public String toString(){

        double totalManagementFeePer = 0.0;
        String ManagementCompanyInfo = "Management Company: " + name + "Tax ID: " + taxID + "\n\n";


        for(int i =0; i<MAX_PROPERTY; i++){
            ManagementCompanyInfo += "Property " + (i+1) + "\n\n";

            ManagementCompanyInfo += "Property Name: " + properties[i].getPropertyName() + '\n';
            ManagementCompanyInfo += "City: " + properties[i].getCity() + '\n';
            ManagementCompanyInfo += "Owner: " + properties[i].getOwner() + '\n';
            ManagementCompanyInfo += "Cost of rent: " + properties[i].getRentAmount() + '\n';
        }
            ManagementCompanyInfo += '\n' + "Total Management Fee: " + totalManagementFeePer;

        return ManagementCompanyInfo;
    }
}
