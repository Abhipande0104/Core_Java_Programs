package dayy10;

public class FixedDepositeAccount extends Account
{
	private double amount;
	private float duration;
	
	public FixedDepositeAccount(int accNo, String name, double amount, float duration)
	{
		super(accNo, name);
		this.amount=amount;
		this.duration=duration;
	}
	
	public void print()
	{
		super.print();
		System.out.println("This is Fixed Deposite Account");
		System.out.println("The amount is "+amount+" and the duration is "+duration);
		System.out.println("    ");
	}
}
