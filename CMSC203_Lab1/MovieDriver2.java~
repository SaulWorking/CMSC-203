import java.util.Scanner;

public class MovieDriver2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		char userInput;
		Movie userMovie  = new Movie();

		//checks if entire program is to be repeated
		Boolean isMovieInput = true;
	
	while(isMovieInput) {
		System.out.print("Enter movie title: ");
		userMovie.setTitle(key.nextLine());
		
		
		System.out.print("Enter movie rating: ");
		userMovie.setRating(key.nextLine());
		
		
		System.out.print("Enter tickets sold: ");
		userMovie.setSoldTickets(key.nextInt());
		
		System.out.print(userMovie.toString());
		
		System.out.print("\nDo you want to enter another movie? (Y/N)");
		
		userInput = key.next().charAt(0);
		key.nextLine();
		switch(userInput) {
		
			case 'Y', 'y'-> {
				isMovieInput = true;
				continue;
			}
		
			case 'N', 'n'-> {
				isMovieInput = false;

				break;
			}
			
			default ->  {
				System.out.println("Invalid Input.");
				isMovieInput = false;
				
			}
		}
		
	}
		
	}

}
