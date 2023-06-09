package day5;

public class ATMTransaction extends Thread
{
	Account ac;
	double amount;
	boolean flag;
	public ATMTransaction(Account ac, double amount, boolean flag)
	{
		super();
		this.ac=ac;
		this.amount=amount;
		this.flag=flag;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		try
		{
			if(flag==true)
				ac.withdraw(amount);
			else
				ac.deposite(amount);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] arsg)
	{
		Account ac= new Account(12345,"Abhishek Pande",10000.00);
		Thread t1= new ATMTransaction(ac, 2000.0, true);
		Thread t2= new ATMTransaction(ac, 3000.0, false);
		t1.start();
		t2.start();
	}
}
