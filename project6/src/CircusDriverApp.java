import java.util.InputMismatchException;
import java.util.Scanner;

public class CircusDriverApp {
    public static void main(String[] args) {
        Circus circus = new Circus();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Bob's Circus Management System!");

        while (!exit) {
            try {
                // Display menu
                System.out.println("\nMenu:");
                System.out.println("1. Add Animal");
                System.out.println("2. Add Person");
                System.out.println("3. Add Building");
                System.out.println("4. Generate Ticket");
                System.out.println("5. Display All Animals");
                System.out.println("6. Display All Persons");
                System.out.println("7. Display All Buildings");
                System.out.println("8. Sort Animals by Age");
                System.out.println("9. Sort Animals by Name");
                System.out.println("10. Search Animal by Name");
                System.out.println("11. Exit\n");

                System.out.print("Choose an option: ");
              
                // Use validateInput method
                int choice = 0;
                boolean validInput = false;

                // Retry until valid input is received

                while (!validInput) {
                    try {

                        choice = validateInput(scanner);
                        validInput = true;

                    } catch (CustomInputMismatchException e) {
			
                       // Print error message 
			    System.out.println(e.message());
			    validInput = false;
                    }
                }
   

                switch (choice) {
                    case 1:
                        handleAddAnimal(circus, scanner);
                        break;
                    case 2:
                        handleAddPerson(circus, scanner);
                        break;
                    case 3:
                        handleAddBuilding(circus, scanner);
                        break;
                    case 4:
                        handleGenerateTicket(circus, scanner);
                        break;
                    case 5:
                        System.out.println("Displaying all animals:");
                        System.out.println("----------------------");
                        circus.displayAllAnimals();
                        break;
                    case 6:
                        System.out.println("Displaying all persons:");
                        System.out.println("----------------------");
                        circus.displayAllPersons();
                        break;
                    case 7:
                        System.out.println("Displaying all buildings:");
                        System.out.println("------------------------");
                        circus.displayAllBuildings();
                        break;
                    case 8:
                        System.out.println("Sorting animals by age...");
                        circus.sortAnimalsByAge();
                        System.out.println("Animals sorted by age.");
                        break;
                    case 9:
                        System.out.println("Sorting animals by name...");
                    circus.sortAnimalsByName();
                        System.out.println("Animals sorted by name.");
                        break;                       
                    case 10:
                        System.out.print("Enter the name of the animal to search: ");
                        scanner.nextLine(); // Consume the leftover newline
                        String searchName = scanner.nextLine();
                     circus.searchAnimalByName(searchName);
                        break;
                    case 11:
                        exit = true;
                        System.out.println("Exiting Bob's Circus Management System. Goodbye!\n");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
       
                } catch (Exception e) {
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		            e.printStackTrace();
                } 
            
        }

        scanner.close();
    }

    
    private static int validateInput(Scanner scanner) throws CustomInputMismatchException {
        try {
            int realNum = scanner.nextInt();
			
            return realNum;
        } catch (InputMismatchException e) {
		System.out.println("Please try a integer value 1 through 11");
            scanner.nextLine();
	       //test. after constructor try again.	
        }
        return -1;
    }
    
    // handleAddAnimal()
    private static void handleAddAnimal(Circus circus, Scanner scanner) {
        try{        
            System.out.println("Enter animal type:");

                System.out.println("1. Bird");
                System.out.println("2. Dog");
                System.out.println("3. Horse");
                System.out.println("4. Lion");
            int animalType = scanner.nextInt();

            //to eat up input
            scanner.nextLine();

            switch(animalType){
                case 1:
                    System.out.println("Enter name: ");
                    String birdName = scanner.nextLine();
                    
                    

                    System.out.println("Enter age: ");
                    int birdAge = scanner.nextInt();

                    //to eat up input
                    scanner.nextLine();

                    System.out.println("Enter species: ");
                    String birdSpecies = scanner.nextLine();

                    System.out.println("Enter color: ");
                    String birdColor = scanner.nextLine();

                    circus.addAnimal(new Bird(birdName, birdAge, birdSpecies, birdColor));
                    return;
                                

                case 2:
                    System.out.print("Enter name: ");
                    String dogName = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int dogAge = scanner.nextInt();
                    //to eat up input
                    scanner.nextLine();

                    System.out.print("Enter species: ");
                    String dogSpecies = scanner.nextLine();

                    System.out.print("Enter color: ");
                    String dogColor = scanner.nextLine();

                    circus.addAnimal(new Dog(dogName, dogAge, dogSpecies, dogColor));
                    return;
                
                case 3:
                    System.out.print("Enter name: ");
                    String horseName = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int horseAge = scanner.nextInt();

                    //to eat up input
                    scanner.nextLine();

                    System.out.print("Enter species: ");
                    String horseSpecies = scanner.nextLine();

                    System.out.print("Enter color: ");
                    String horseColor = scanner.nextLine();

                    circus.addAnimal(new Horse(horseName, horseAge, horseSpecies, horseColor));
                    return;
            
             case 4:
                    System.out.println("Enter name: ");
                    String lionName = scanner.nextLine();

                    System.out.println("Enter age: ");
                    int lionAge = scanner.nextInt();

                    //to eat up input
                    scanner.nextLine();

                    System.out.println("Enter species: ");
                    String lionSpecies = scanner.nextLine();

                    System.out.println("Enter color: ");
                    String lionColor = scanner.nextLine();

                    circus.addAnimal(new Lion(lionName, lionAge, lionSpecies, lionColor));
                    return;
                default:
                    System.out.println("Invalid animal type. Please try again.");
                    return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please try again.");
        }
    }
	
    // handleAddPerson()
    private static void handleAddPerson(Circus circus, Scanner scanner) {
            System.out.println("Enter Job type:");

                System.out.println("1. Acrobatic");
                System.out.println("2. Clerk");
   
                  int job = scanner.nextInt();
 
                    //to eat up input
                    scanner.nextLine();
        try{
        switch(job){
            case 1:
                System.out.print("Enter name: ");
                String Aname = scanner.next();

                System.out.print("Enter age: ");
                int Aage = scanner.nextInt();

                System.out.print("Enter years worked: ");
                int AyearsWorked = scanner.nextInt();
                // to eat up input
                scanner.nextLine();
                
                circus.addPerson(new Acrobatic(Aname, Aage, AyearsWorked, "Acrobatic"));
                return;

            case 2:
                System.out.print("Enter name: ");
               String Cname = scanner.next();

                System.out.print("Enter age: ");
              int  Cage = scanner.nextInt();

                System.out.print("Enter years worked: ");
              int  CyearsWorked = scanner.nextInt();

                              // to eat up input
                scanner.nextLine();

                circus.addPerson(new Clerk(Cname, Cage, CyearsWorked, "Clerk"));
                return;

            default:
                System.out.println("Invalid person type. Please try again.");
                return;
        }
    } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please try again.");
            scanner.nextLine();
        }
    }
	
    // handleAddBuilding()
    private static void handleAddBuilding(Circus circus, Scanner scanner) {
            System.out.println("Enter Building type:");

                System.out.println("1. Arena");
                System.out.println("2. Ticketing Office");    
             int buildingType = scanner.nextInt();

        //to eat up input
        scanner.nextLine();
        
        try{
        switch(buildingType){
            case 1:
                System.out.print("Enter color: ");
                 String Arenacolor = scanner.nextLine();
          
                System.out.print("Enter length: ");
                 int Arenalength = scanner.nextInt();

                System.out.print("Enter width: ");
                 int Arenawidth = scanner.nextInt();

                // to eat up input
                scanner.nextLine();

                circus.addBuilding(new Arena(Arenacolor, Arenalength, Arenawidth));
                return;
            case 2:
	   
                System.out.print("Enter color: ");
                 String Ticketcolor = scanner.nextLine();
          
                System.out.print("Enter length: ");
                 int Ticketlength = scanner.nextInt();

                System.out.print("Enter width: ");
                 int Ticketwidth = scanner.nextInt();

                // to eat up input
                scanner.nextLine();

                circus.addBuilding(new TicketingOffice(Ticketcolor, Ticketlength, Ticketwidth));
                return;

            default:
                System.out.println("Invalid building type. Please try again.");
                return;
        }
        }catch(InputMismatchException e){   
            System.out.println("Invalid input type. Please try again.");
            scanner.nextLine();
        }
    
    }




    private static void handleGenerateTicket(Circus circus, Scanner scanner) {

        double totalAmount = 0;
        double basePrice;
        StringBuilder ticketDetails = new StringBuilder();
        boolean addMoreTickets = true;

        System.out.print("\nEnter ticket base price: ");
        basePrice = scanner.nextDouble();
        scanner.nextLine();

        ticketDetails.append(String.format("Regular ticket price: $%.2f%n%n", basePrice));

        while (addMoreTickets) {
            // Select day of the week
            System.out.println("\nSelect day of the week:");
            for (int i = 0; i < DayOfWeek.values().length; i++) {
                DayOfWeek day = DayOfWeek.values()[i];
                if (day.getDiscount() > 0) {
                    System.out.printf("%d. %s (%.0f%% discount)%n", i + 1, day, day.getDiscount() * 100);
                } else {
                    System.out.printf("%d. %s%n", i + 1, day);
                }
            }
            System.out.print("\nEnter your choice: ");
            int dayChoice = scanner.nextInt();
            scanner.nextLine();

            if (dayChoice < 1 || dayChoice > DayOfWeek.values().length) {
                System.out.println("Invalid choice. Please select a valid day.");
                continue;
            }

            DayOfWeek selectedDay = DayOfWeek.values()[dayChoice - 1];
            double dayDiscount = selectedDay.getDiscount();

            // Select customer type
            System.out.println("\nEnter customer type:");
            System.out.println("1. Child (10% discount)");
            System.out.println("2. Student (10% discount)");
            System.out.println("3. Adult");
            System.out.println("4. Senior (5% discount)");
            System.out.print("\nEnter your choice: ");
            int customerType = scanner.nextInt();
            scanner.nextLine();

            double customerDiscount = 0.0;
            String customerTypeName = "";
            switch (customerType) {
                case 1:
                    customerDiscount = 0.10;
                    customerTypeName = "child";
                    break;
                case 2:
                    customerDiscount = 0.10;
                    customerTypeName = "student";
                    break;
                case 3:
                    customerTypeName = "adult";
                    break;
                case 4:
                    customerDiscount = 0.05;
                    customerTypeName = "senior";
                    break;
                default:
                    System.out.println("Invalid customer type. Please try again.");
                    continue;
            }

            // Select seat location
            System.out.println("\nSeat Location in the Arena:");
            System.out.println("1. Lower level");
            System.out.println("2. T-level (double ticket price)");
            System.out.println("3. Upper level (5% discount)");
            System.out.print("\nEnter your choice: ");
            int seatLocation = scanner.nextInt();
            scanner.nextLine();

            double seatMultiplier = (seatLocation == 2) ? 2.0 : 1.0;
            double seatDiscount = (seatLocation == 3) ? 0.05 : 0.0;

            System.out.print("Enter number of tickets: ");
            int numberOfTickets = scanner.nextInt();
            scanner.nextLine();

            double ticketPrice = 0.0;
	    double totalDiscount = dayDiscount + customerDiscount + seatDiscount;

	    //keeping the tickets on record for safe keeping
	    for(int i =0; i<numberOfTickets;i++){
		    Ticket ticket = circus.generateTicket(selectedDay.toString(),basePrice,customerType);
		    circus.addTicket(ticket);
		    System.out.println(ticket);
	    }

	    // Calculate discounts and total price for this batch of tickets
	    ticketPrice = (basePrice * seatMultiplier) * (1 - totalDiscount) * numberOfTickets;


	    // Add to total amount
	    totalAmount += ticketPrice;



	    // Append details of this batch to the ticket details
	    ticketDetails.append(String.format("Day: %s, Customer Type: %s, Seat Location: %d, Number of Tickets: %d, Price: $%.2f%n",
				    selectedDay, customerTypeName, seatLocation, numberOfTickets, ticketPrice));


	    // Ask user to add more tickets
	    System.out.print("\nDo you want to add more tickets? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            addMoreTickets = response.equals("y");
        }

        // Display ticket calculation details
        System.out.println("\nTicket Calculation Details:");
        System.out.println("---------------------------");
        System.out.println(ticketDetails);

        // Display final total amount
        System.out.printf("Final Total Amount: $%.2f%n", totalAmount);
        System.out.println("Enjoy the show!");
    }


   
}
