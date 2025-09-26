public class Patient{
	
		private String firstName, middleName, lastName;
		private String address, city, state, ZIP;
		private	String phoneNum;
		private	String emergencyContact, emergencyPhoneNum;

	Patient(){
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";	
		this.address = "";
		this.city = "";
		this.state = "";
		this.ZIP = "";
		this.emergencyContact = "";
		this.emergencyPhoneNum = "";
	}

	Patient(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.firstName = firstName;
		this.firstName = firstName;
	}  
	
	Patient(String firstName, String middleName, String lastName, String address, String city, String state, String ZIP, String phoneNum, String emergencyContact, String emergencyPhoneNum){
		this(firstName, middleName, lastName);	

		this.address = address;
		this.city = city;
		this.state = state;
		this.ZIP = ZIP;
		this.emergencyContact = emergencyContact;
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZIP() { return ZIP; }
    public String getPhoneNum() { return phoneNum; }
    public String getEmergencyContact() { return emergencyContact; }
    public String getEmergencyPhoneNum() { return emergencyPhoneNum; }

 	public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZIP(String ZIP) { this.ZIP = ZIP; }
    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }
    public void setEmergencyPhoneNum(String emergencyPhoneNum) { this.emergencyPhoneNum = emergencyPhoneNum;
	 }
	 
	@Override
	public String toString() {
    return "Patient Information:\n" +
           "First Name: " + getFirstName() + "\n" +
           "Middle Name: " + getMiddleName() + "\n" +
           "Last Name: " + getLastName() + "\n" +
           "Address: " + getAddress() + "\n" +
           "City: " + getCity() + "\n" +
           "State: " + getState() + "\n" +
           "ZIP: " + getZIP() + "\n" +
           "Phone Number: " + getPhoneNum() + "\n" +
           "Emergency Contact: " + getEmergencyContact() + "\n" +
           "Emergency Phone Number: " + getEmergencyPhoneNum();
}

}
