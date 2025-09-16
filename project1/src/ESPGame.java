import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.io.IOException;
import java.io.File;

public class ESPGame{
	public static void main(String[] args)throws IOException {
	final String fileName = "colors.txt";
	Boolean isCorrectInput = false;
	
	Scanner key = new Scanner(System.in);
	HashMap<Integer, String> colors = new HashMap<>();
//credits to w3schools.com for their hashtable tutroial
//link: w3schools.com/java/java_hashmap.asp

	int upperLimit = 0;
	int guessingCounter = 0;

	System.out.println("a. 16 colors");
	System.out.println("b. 10 colors ");
	System.out.println("c. 5 colors");
	System.out.println("d. exit");
	char userInput = key.nextLine().charAt(0);
	int userNum;


	try(Scanner fileRead = new Scanner(new File(fileName))){
		int count = 1;

		while(fileRead.hasNext()){
			String colorName =  fileRead.nextLine();
			colors.put(count, colorName);
			count++;
		}

		while(isCorrectInput == false){
			switch(userInput){
				case 'a' ->{
					for(int i =1; i<=16; i++){
						System.out.println("Color #" + (i) + ": " + colors.get(i));
						
					isCorrectInput = true;
					upperLimit = 16;
					}
				}

				case 'b' ->{
					for(int i =1; i<=10; i++){
						System.out.println("Color #" + (i) + ": " + colors.get(i));
					}	
					isCorrectInput = true;
					upperLimit = 10;
				}

				case 'c' ->{
					for(int i =1; i<=5; i++){
						System.out.println("Color #" + (i) + ": " + colors.get(i));
					}	
					isCorrectInput = true;
					upperLimit =5;
				}

				case 'd' ->{
                    isCorrectInput = true;	
					System.exit(0);
				}

				default ->{
					System.out.println("Invalid Input. Try again.");
					isCorrectInput = false;
					userInput = key.nextLine().charAt(0);
				}
			}
		}
}

Random randomNum = new Random();

for(int i =0; i< 3; i++){
	int tempNum = 0;
	tempNum = randomNum.nextInt(upperLimit)+1;


	System.out.println(colors.get(tempNum));

	System.out.println("Choose a color number...");
	userNum = key.nextInt();

		System.out.println("Color Number: " + tempNum);
		if(userNum == tempNum){
	System.out.println(colors.get(tempNum));
			guessingCounter++;
			System.out.println("\nYOU WINwin!");
		}else{

	System.out.println(colors.get(tempNum));
			System.out.println("YOU FAIL\n\nFail");
		}

}
key.nextLine();

String userName, userDesc, userDate;
System.out.println("What is your username? ");
userName = key.nextLine();

System.out.println("Describe yourself. ");
userDesc = key.nextLine();


System.out.println("What is today's date? (in the format MM/DD/YY) ");
userDate = key.nextLine();



System.out.println("You guessed " + guessingCounter + " colors right.");
System.out.println("Due Date: 09/15/25");
System.out.println("Username: " + userName);
System.out.println("User Description: " + userDesc);
System.out.println("Date: " + userDate);



	key.close();
	
// fileRead auto closes, no need to close unless for documentation:
	System.out.println("End of program");

	}
}

