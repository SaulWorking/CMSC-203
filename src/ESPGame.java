import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ESPGame{
	public static void main(String[] args)throws IOException{
	
	Scanner key = new Scanner(System.in);
	Scanner inputFile = new Scanner(new File("colors.txt"));
	String userColor = "";
	Random rn = new Random();	
	int options = 0;	

	System.out.println("a. 16 colors");
	System.out.println("b. 10 colors ");
	System.out.println("c. 5 colors");
	System.out.println("d. exit");
	char userInput = key.nextLine().charAt(0);
	
	switch(userInput){
		case 'a' ->{
			while(inputFile.hasNextLine()){
				String color =  inputFile.nextLine();
				System.out.println(color);
				colors = rn.nextInt(1,16);
			}
		}
	}


	inputFile.close();
		System.out.println("End of program");

	}
}
