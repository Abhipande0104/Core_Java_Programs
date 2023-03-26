package dayy14zBank;

public class ATM 
{
	private String bankname;
	private int balance;
	
	public ATM(String name, int bal)
	{
		bankname=name;
		balance= bal;
	}
	
	public void display()
	{
		System.out.println("The details of ATM are ");
		System.out.println("The bank name is "+bankname+" and balance is "+balance);
	}
}
