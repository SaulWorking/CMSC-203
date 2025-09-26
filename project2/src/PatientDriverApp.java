import java.util.Scanner;

public class PatientDriverApp{

	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		Patient userInfo = new Patient();

		userInfo.setFirstName(key.nextLine());
		userInfo.setMiddleName(key.nextLine());
		userInfo.setLastName(key.nextLine());
		userInfo.setAddress(key.nextLine());
		userInfo.setCity(key.nextLine());
		userInfo.setState(key.nextLine());
		userInfo.setZIP(key.nextLine());
		userInfo.setPhoneNum(key.nextLine());
		userInfo.setEmergencyContact(key.nextLine());
		userInfo.setEmergencyPhoneNum(key.nextLine());


		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure();
		Procedure procedure3 = new Procedure();



		displayPatient();
	}
/*
public String getProcedureName() { return procedureName; }
public String getDate() { return date; }
public double getCharge() { return charge; }
public String getPractitionerName() { return practitionerName; }

public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
public void setDate(String date) { this.date = date; }
public void setCharge(double charge) { this.charge = charge; }
public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
*/
	
	static void displayPatient(){

		System.out.println(userInfo.toString());
	}

	static void displayProcedure(){

	}

	static double calculateTotalCharges(){
	return 10.5;	
	}

}
