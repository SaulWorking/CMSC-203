public class SavingsAccount extends BankAccount{

	private double rate = 0.025;
	private static int savingsNumber =0;
	private String accountNumber;

	public SavingsAccount(String name, double amount){
		accountNumber = super.getAccountNumber();
		accountNumber += "-" +savingsNumber
		savingsNumber++;
	
	}


}
