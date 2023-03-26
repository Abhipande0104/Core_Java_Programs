package dayy10;

public class SavingAccount extends Account
{
	private double balance;
	
	public SavingAccount(int accNo, String name, double balance)
	{
		super(accNo, name);
		this.balance=balance;
	}

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		super.print();
		System.out.println("This is Savings Account");
		System.out.println("The balance is "+balance);	
		System.out.println("   ");
	}
}