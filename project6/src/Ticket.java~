public class Ticket {
    private double basePrice;
    private String day;
    private int age;

    public Ticket(String day, double basePrice, int age) {
        this.basePrice = basePrice;
        this.age = age;
        this.day = day.toLowerCase();
    }

    // Calculate ticket price based on day of week and age

    public double calculatePrice() {
        double finalPrice = basePrice;
        double totalDiscount = 0.0;

        // Apply discounts for weekdays
        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            totalDiscount += 0.10; // 10% discount for weekdays
        }

        // no idea why i need ticktets
        if(age < 12) {
            totalDiscount += 0.10;
        } else if(age >= 12 && age <= 21) {
            totalDiscount += 0.10; 
        } else if(age >= 65) {
            totalDiscount += 0.05;
        }

        finalPrice = finalPrice * (1 - totalDiscount);
        return finalPrice;
    }



    // Display the ticket details
    public void displayTicketDetails() {
        System.out.printf("Ticket Details: [Age: %d, Day: %s, Price: $%.2f]%n",
                          age, day.substring(0, 1).toUpperCase() + day.substring(1), calculatePrice());
    }

    @Override
    public String toString() {
        return String.format("Ticket [Day: %s, Age: %d, Price: $%.2f]",
                             day.substring(0, 1).toUpperCase() + day.substring(1), 
                             age, calculatePrice());
    }
}
