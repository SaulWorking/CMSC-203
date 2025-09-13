import java.util.Scanner;
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
					upperLimit = 16;
				}

				case 'b' ->{
					for(int i =0; i<10; i++){
						System.out.println("Color #" + (i+1) + ": " + colors[i]);
					}	
					isCorrectInput = true;
					upperLimit = 10;
				}

				case 'c' ->{
					for(int i =0; i<5; i++){
						System.out.println("Color #" + (i+1) + ": " + colors[i]);
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

int randomNum;

for(int i =0; i< 3; i++){
	randomNum = Math.random(upperLimit);
	System.out.println(colors[randomNum]);

	System.out.println("Choose a color number...");
	userNum = key.nextInt();

		if(userNum == randomNum){
	System.out.println(colors[randomNum]);

			System.out.println("win!");
		}else{

	System.out.println(colors[randomNum]);
			System.out.println("Fail");
		}

}

	



	key.close();
	
// fileRead auto closes, no need to close unless for documentation:
	System.out.println("End of program");

	}
}
