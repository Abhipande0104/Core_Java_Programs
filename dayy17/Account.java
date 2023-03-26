package dayy17;

public class Account 
{
	int accNo;
	String ownerName;
	double balance;
	
	public void withdraw(double amt) throws InsufficientBalanceException
	{
		if(amt<1000)
		{
			throw new InsufficientBalanceException("The balance is insufficient");
		}
		else
		{
			System.out.println("Amount "+amt+" deducted successfully");
		}
	}
	
	public static void main(String[] args)
	{
		Account ac= new Account();
		try
		{
			ac.withdraw(999);
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
}
