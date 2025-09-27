/*
 * Class: CMSC203 
 * Instructor: Huseyin Agyun
 * Description: Driver class for patient and procedure information. Asks for patient information and three procedures. This information is displayed after.
 * Due: 09/27/25
 * Platform/compiler: JDK 21
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Thien Dinh
*/


import java.util.Scanner;

/**
 * Main method for Patient and Procedure classes
 */
public class PatientDriverApp{

	/**
	 * Main method
	 * @param args Optional running input
	 */
	public static void main(String[] args){
		String firstName = "", middleName = "", lastName= "";
		String address= "" ,   city= "" , 		state= "" , zip= "" ;
		String phoneNum= "" ,  emergencyContact= "" , emergencyPhoneNum= "" ;
		
		String procedureName = "", procedureDate = "", practitionerName = "";
		double chargeCost = 0.0;


		Scanner key = new Scanner(System.in);

System.out.println("First name:");
		firstName = key.nextLine();
		
		System.out.println("Middle name:");
		middleName = key.nextLine();
		
		System.out.println("Last name:");
		lastName = key.nextLine();
		
		System.out.println("Address name:");
		address = key.nextLine();
		
		System.out.println("City name:");
		city = key.nextLine();
		
		System.out.println("State name:");
		state = key.nextLine();
		
		System.out.println("Zip code:");
		zip = key.nextLine();
		
		System.out.println("Phone number:");
		phoneNum = key.nextLine();
		
		System.out.println("Emergency contact:");
		emergencyContact = key.nextLine();
		
		System.out.println("Emergency phone number:");
		emergencyPhoneNum = key.nextLine();
		
	
		Patient userInfo = new Patient(firstName, middleName, lastName, address, city, state, zip, phoneNum, emergencyContact, emergencyPhoneNum);
		

System.out.println("Give information for three procedures.\n");
System.out.println("Procedure 1");
		System.out.println("Procedure name:");
		procedureName = key.nextLine();
		
		System.out.println("Procedure date:");
		procedureDate = key.nextLine();
		
		System.out.println("Procedure cost:");
		chargeCost = key.nextDouble();
		
		eatInput(key);
		System.out.println("Practitioner name:");

		practitionerName = key.nextLine();

		Procedure procedure1 = new Procedure(procedureName, procedureDate, chargeCost, practitionerName);

		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		chargeCost = 0.0;

System.out.println("Procedure 2");
		System.out.println("Procedure name");
		procedureName = key.nextLine();	
		System.out.println("Procedure date");
		procedureDate = key.nextLine();
		System.out.println("Procedure cost");
		chargeCost = key.nextDouble();

		eatInput(key);	
		System.out.println("Practitioner name:");
		practitionerName = key.nextLine();

		Procedure procedure2 = new Procedure(procedureName, procedureDate, chargeCost, practitionerName);

		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		chargeCost = 0.0;

System.out.println("Procedure 3");
		System.out.println("Procedure name");
		procedureName = key.nextLine();	
		System.out.println("Procedure date");
		procedureDate = key.nextLine();
		System.out.println("Procedure cost");
		chargeCost = key.nextDouble();

		eatInput(key);	
		System.out.println("Practitioner name:");
		practitionerName = key.nextLine();


		Procedure procedure3 = new Procedure(procedureName, procedureDate, chargeCost, practitionerName);
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		chargeCost = 0.0;
		
		
		
		displayPatient(userInfo);
		displayProcedure(procedure1);	
		displayProcedure(procedure2);	
		displayProcedure(procedure3);

		System.out.printf("Total charges: $%,.2f", calculateTotalCharges(procedure1, procedure2, procedure3));

		printStudentInfo();
	}
/**
 * Method for eating up leftover new lines in buffer.
 * @param key Main user input
 * 
 */


	static void eatInput(Scanner key){
		key.nextLine();
	}

	/**
	 * Print student information
	 */
	static void printStudentInfo(){
		System.out.print("\n\n");
		System.out.println("Student name: Thien Dinh");
		System.out.println("Due Date: 09/29/25");
	}
/**
 * Display patient information
 * @param info Patient information
 */
	static void displayPatient(Patient info){

		System.out.println(info.toString());
	}
/**
 * Display procedure information
 * @param operation Procedure information
 */
	static void displayProcedure(Procedure operation){
		System.out.println(operation.toString());
	}

/**
 * Calculate the sum of procedure charges
 * @param proc1 first procedure
 * @param proc2 second procedure
 * @param proc3 third procedure
 * @return Sum of the charges of proc1, proc2, and proc3
 */
	
	static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3){
		return (proc1.getCharge() + proc2.getCharge() + proc3.getCharge());
	}

}
