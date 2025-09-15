/*
 * Class: CMSC203 
 * Instructor: Huseyin Agyun
 * Description: (Give a brief description for each Class)
 * Due: 9/14/2025
 * Platform/compiler: Java JDK 21
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Thien Dinh
*/
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;

public class ESPGame{
	public static void main(String[] args)throws IOException {
		final String fileName = "colors.txt";

	//if input is false and play again is true, then while loop restarts
		Boolean isCorrectInput = false;
		Boolean playAgain = false;

	//user's Keyboard input
		Scanner key = new Scanner(System.in);
	//limit for random number generator
		int upperLimit = 0;
		int playerWins = 0;

	//user input datatypes
		char userInput;
		int userNum;


	try(Scanner fileRead = new Scanner(new File(fileName))){
		int count = 1;
//set isIncorrectInput to false before loop to ensure less faulty programming
		isCorrectInput = false;
		while(isCorrectInput == false || playAgain == true){
			System.out.println("a. 16 colors listed");
			System.out.println("b. 10 colors listed");
			System.out.println("c. 5 colors listed");
			System.out.println("d. exit");
			userInput = key.nextLine().charAt(0);

				switch(userInput){
					case 'a', 'A'->{
						while(fileRead.hasNext()){
							String color = fileRead.nextLine();
							System.out.println("Color # " + count + ": " + color);
							count++;	
						}
						isCorrectInput = true;	
							upperLimit = 16; 
					}
					
					case 'b', 'B'->{
						for(int i =1; i<=10; i++){
							if(fileRead.hasNext()){
								String color = fileRead.nextLine();
							System.out.println("Color # " + (i) + ": " + color);
							}
						}
						
						
						isCorrectInput = true; 
						upperLimit = 10;
					}

					case 'c', 'C' ->{
						for(int i =1; i<=5; i++){
							if(fileRead.hasNext()){
								String color = fileRead.nextLine();
							System.out.println("Color # " +(i) + ": " + color);
							}
						}
						isCorrectInput = true;
						upperLimit =5;
					}

					case 'd', 'D' ->{

						isCorrectInput = true;	
						System.exit(0);
					}

					default ->{
						System.out.println("Invalid Input. Try A, B, C, or D.");
						isCorrectInput = false;
						continue;
					}
				}
//create random number generator			
				Random random = new Random();
				for(int i =1; i<=3; i++){
					System.out.println("/******************************************************************************/");
					System.out.println("Round " + i);
						int randomNum = 0;
						randomNum = random.nextInt(upperLimit) + 1;
						System.out.println("Choose a color number...");
						
						Scanner colorRead = new Scanner(new File(fileName));

							for(int j=1; j<=upperLimit; j++){
								if(colorRead.hasNext()){
									String color = colorRead.nextLine();
									System.out.println("Color # " +(j) + ": " + color);
								}
							}
	//remember to close colorRead file
						colorRead.close();

						System.out.print("\tColor Number: ");
						userNum = key.nextInt();
						System.out.print('\n');

						if(userNum ==  randomNum){
						Scanner answerRead = new Scanner(new File(fileName));
							for(int k=1; k<=randomNum; k++){
								String answer = answerRead.nextLine();
									if(k == randomNum){
										System.out.println("I was thinking of Color #" +(randomNum) + ": " + answer);
									}
							}
							playerWins++;
							answerRead.close();	
						}
	//remember to close answerRead file

					System.out.println("/******************************************************************************/");
				}
				System.out.println("You won " + playerWins + " out of 3 games.");
				System.out.println("Do you want to play again? (Y/N)");
				key.nextLine();
//
	isCorrectInput = false;
			while(isCorrectInput == false){
					userInput = key.nextLine().charAt(0);

				switch(userInput){
					case 'Y':
					case 'y': 
						count++;
						playAgain = true;	
						isCorrectInput = true;
						continue;
				
					case 'N':
					case 'n': 
						playAgain = false;
						isCorrectInput = true;
						break;

					default: 
						System.out.println("Invalid input. Try 'Y' or 'N'.");
						isCorrectInput = false;
						playAgain = false;	
					
				}

			}
		}
	}

String userName, userDesc, userDate;

try(FileWriter appendToFile = new FileWriter("ESPGameresults.txt", true)){
	PrintWriter writeToFile = new PrintWriter(appendToFile);
	System.out.println("Enter your name: ");
		userName = key.nextLine();
	System.out.println("Describe yourself: ");
		userDesc = key.nextLine();
	System.out.println("Current Date: ");
		userDate = key.nextLine();

	System.out.println("Programmer's name: Thien");
	System.out.println("Username: " + userName);
	System.out.println("Due Date: 9/15/2025");
	System.out.println("User Description: " + userDesc);
	System.out.println("Current Date: " + userDate);

	writeToFile.println("Username: " + userName);
	writeToFile.println("Due Date: 9/15/2025");
	writeToFile.println("User Description: " + userDesc);
	writeToFile.println("Current Date: " + userDate);
	writeToFile.print('\n');

}
	
key.close();
// fileRead auto closes, no need to close.
	System.out.println("End of program");

	}
}
