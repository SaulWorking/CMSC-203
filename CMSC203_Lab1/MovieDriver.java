import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		char userInput;
		Movie userMovie  = new Movie();
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
