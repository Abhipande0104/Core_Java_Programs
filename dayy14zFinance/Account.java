package dayy14zFinance;

public class Account 
{
	public static String bankname;
	private int accNo;
	private String name;
	public Account()
	{
		accNo=100;
		name="XYZ";
	}
	public Account(int acc, String n)
	{
		accNo=acc;
		name=n;
	}
	public void display()
	{
		System.out.println("The details of account is ");
		System.out.println("Account No is "+accNo+"  Name is "+name);
		System.out.println("     ");
	}
	
	public static void showStaticData()
	{
		bankname="HDFC";
		System.out.println("The bank name is "+bankname);
	}
}

