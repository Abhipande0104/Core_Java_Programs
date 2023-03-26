package dayy14zFinance;

import dayy14zBank.ATM;

public class BankMain1 
{
	public static void main(String[] args)
	{
	//	Account ac= new Account(101,"HDFC");
	//	ac.display();
		
		ATM at = new ATM("SBI",25000);
		at.display();
	}
	
}
