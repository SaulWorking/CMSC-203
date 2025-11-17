import java.util.Scanner;

public class MovieDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		char userInput;
		Movie userMovie  = new Movie();
		Boolean isMovieInput = true;
	
		System.out.print("Enter movie title: ");
		userMovie.setTitle(key.nextLine());
		
		
		System.out.print("Enter movie rating: ");
		userMovie.setRating(key.nextLine());
		
		
		System.out.print("Enter tickets sold: ");
		userMovie.setSoldTickets(key.nextInt());
		
		System.out.print(userMovie.toString());
		
		
	
		
	}

}
