/**
 * Contains information for each patient
 */

public class Patient{
	
		private String firstName, middleName, lastName;
		private String address, city, state, ZIP;
		private	String phoneNum;
		private	String emergencyContact, emergencyPhoneNum;

	/**
	 * Constructor for patient information
	 */
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
	/**
	 * Constructor for patient information
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 */
	Patient(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}  
	/**
	 * Constructor for patient information
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param ZIP
	 * @param phoneNum
	 * @param emergencyContact
	 * @param emergencyPhoneNum
	 */
	Patient(String firstName, String middleName, String lastName, String address, String city, String state, String ZIP, String phoneNum, String emergencyContact, String emergencyPhoneNum){
		this(firstName, middleName, lastName);	
		this.address = address;
		this.city = city;
		this.state = state;
		this.ZIP = ZIP;
		this.phoneNum = phoneNum;
		this.emergencyContact = emergencyContact;
		this.emergencyPhoneNum = emergencyPhoneNum;
	}
	/**
	 * Returns patient's first name
	 * @return firstName the patient's first name
	 */
    public String getFirstName() { return firstName; }
	/**
	 * Returns patient's middle name
	 * @return middleName the patient's middle name
	 */
    public String getMiddleName() { return middleName; }
    /**
     * Return patient's last name
     * @return lastName the patient's
     */

    public String getLastName() { return lastName; }
    /**
     * Return patient's address;
     * @return address the patient's address
     */

    public String getAddress() { return address; }
    /**
     * Return patient's city
     * @return city the patient's city
     */
 
    public String getCity() { return city; }
        /**
     * Return patient's state
     * @return state the patient's state
     */
 
    public String getState() { return state; }
    /**
     * Return patient's ZIP code
     * @return ZIP the patient's ZIP
     */
    public String getZIP() { return ZIP; }
    /**
     * Return patient's phone number
     * @return phoneNum the patient's phone number
     */
    public String getPhoneNum() { return phoneNum; }
    /**
     * Return patient's emergency contact
     * @return emergencyContact the patient's emergency contact
     */
    public String getEmergencyContact() { return emergencyContact; }
    /**
     * Return patient's emergency phone number
     * @return emergencyPhoneNum the patient's emergency phone number
     */
    public String getEmergencyPhoneNum() { return emergencyPhoneNum; }
    /**
     * Sets patient's first name
     * @param firstName the patient's first name
     */

 	public void setFirstName(String firstName) { this.firstName = firstName; }
  
    /**
     * Sets patient's middle name
     * @param middleName the patient's middle name
     */ 


    public void setMiddleName(String middleName) { this.middleName = middleName; }
    /**
     * Sets patient's last name
     * @param lastName the patient's last name
     */

    public void setLastName(String lastName) { this.lastName = lastName; }
    /**
     * Sets patient's address
     * @param address the patient's address
     */

    public void setAddress(String address) { this.address = address; }
    /**
     * Sets patient's city
     * @param city the patient's city
     */

    public void setCity(String city) { this.city = city; }
    /**
     * Sets patient's state
     * @param state the patient's state
     */

    public void setState(String state) { this.state = state; }
    /**
     * Sets patient's ZIP code
     * @param ZIP the patient's ZIP
     */

    public void setZIP(String ZIP) { this.ZIP = ZIP; }
    /**
     * Sets patient's phone number
     * @param phoneNum the patient's phone number
     */

    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
    /**
     * Sets patient's emergency contact
     * @param emergencyContact the patient's emergency contact
     */

    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }
    /**
     * Sets patient's emergency contact
     * @param emergencyPhoneNum the patient's emergency phone number
     */

    public void setEmergencyPhoneNum(String emergencyPhoneNum) { this.emergencyPhoneNum = emergencyPhoneNum;}

/**
 * Returns patient's full name.
 * @return firstName + middleName + lastName
 */
    public String buildFullName() {
    	return getFirstName() + ' ' + getMiddleName() + ' ' + getLastName();
    }
    /**
     * Returns patient's home address.
     * @return address + city + state + ZIP
     */
    public String buildAddress() {
    	return getAddress() + ' ' + getCity() + ' ' + getState() + ' ' + getZIP();
    }
    /**
     * Returns patient's emergency contacts.
     * @return emergencyContact + emergencyPhoneNum
     */
    public String buildEmergencyContact() {
    	return getEmergencyContact() + ' '  + getEmergencyPhoneNum();
    }
	@Override
	public String toString() {
    return "Patient Information:\n" +
           "  Patient Name: " + buildFullName() + '\n' + 
           "  Address: " + buildAddress() + '\n' +
           "  Patient Number: " + getPhoneNum() + '\n' +
           "  Emergency Contact: " + buildEmergencyContact() + '\n';
}

}
