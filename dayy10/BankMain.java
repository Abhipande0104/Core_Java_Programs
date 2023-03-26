package dayy10;

public class BankMain
{
	public static void main(String[] abcd)
	{
		SavingAccount sa= new SavingAccount(100,"abhi",25000);
		sa.print();
		
		FixedDepositeAccount fd= new FixedDepositeAccount(101, "ajay", 25000, 5);
		fd.print();
		
	}
}
