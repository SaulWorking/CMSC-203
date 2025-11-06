public class CheckingAccount extends BankAccount{
	private static int FEE = 0.15;

	public CheckingAccount(String name, double amount){
		super(name, amount);
	}

	public boolean withdraw(double amount){
		super(amount);	
	}
}
