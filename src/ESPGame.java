import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.File;

public class ESPGame{
	public static void main(String[] args)throws IOException {
	final String fileName = "colors.txt";
	Boolean isCorrectInput = false;
	
	Scanner key = new Scanner(System.in);
	String colors[];
	colors = new String[16];
	int upperLimit = 0;

	System.out.println("a. 16 colors");
	System.out.println("b. 10 colors ");
	System.out.println("c. 5 colors");
	System.out.println("d. exit");
	char userInput = key.nextLine().charAt(0);
	int userNum;


	try(Scanner fileRead = new Scanner(new File(fileName))){
		int count = 0;

		while(fileRead.hasNext()){
			String color =  fileRead.nextLine();
			colors[count] = color;
			count++;
		}

		while(isCorrectInput == false){
			switch(userInput){
				case 'a' ->{
					for(int i =0; i<16; i++){
						System.out.println("Color #" + (i+1) + ": " + colors[i]);
					}	
					isCorrectInput = true;
					upperLimit = 15;
				}

				case 'b' ->{
					for(int i =0; i<10; i++){
						System.out.println("Color #" + (i+1) + ": " + colors[i]);
					}	
					isCorrectInput = true;
					upperLimit = 9;
				}

				case 'c' ->{
					for(int i =0; i<5; i++){
						System.out.println("Color #" + (i+1) + ": " + colors[i]);
					}	
					isCorrectInput = true;
					upperLimit =4;
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
	tempNum = randomNum.nextInt(upperLimit) + 1;

	if(tempNum == 16){
		tempNum = 15;
	}

	System.out.println(colors[tempNum]);

	System.out.println("Choose a color number...");
	userNum = key.nextInt();

		System.out.println("Color Number: " + tempNum);
		if(userNum == tempNum){
	System.out.println(colors[tempNum]);

			System.out.println("\nYOU WINwin!");
		}else{

	System.out.println(colors[tempNum]);
			System.out.println("YOU FAIL\n\nFail");
		}

}

	



	key.close();
	
// fileRead auto closes, no need to close unless for documentation:
	System.out.println("End of program");

	}
}
