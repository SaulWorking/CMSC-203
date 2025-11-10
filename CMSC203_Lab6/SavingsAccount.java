public class SavingsAccount extends BankAccount{

	private double rate = 0.025;
	private static int savingsNumber =0;
	private String accountNumber;

	public SavingsAccount(String name, double amount)
	{
		super(name,amount);
		this.accountNumber = super.getAccountNumber();
		this.accountNumber += "-" +savingsNumber;
		savingsNumber++;
	}

	public SavingsAccount(SavingsAccount oldAccount, double amount){
		
		super(oldAccount, amount);	
		this.accountNumber = super.getAccountNumber();
		this.accountNumber += "-" +savingsNumber;	
		savingsNumber++;
	}

	public void postInterest(){
		double bal = super.getBalance();
		super.deposit(bal * (rate/12));
	}

	public String getAccountNumber(){
		return this.accountNumber;	
	}


}
