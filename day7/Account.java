package day7;

public class Account 
{
	private int accNo;
	private String name;
	MyDate1 creationDate;
	
	public Account()
	{
		accNo=100;
		name="XYZ";
	}
	public Account(int acc, String n, MyDate1 cr)
	{
		accNo=acc;
		name=n;
		creationDate=cr;
	}
	public void display()
	{
		System.out.println("The details of account is ");
		System.out.println("Account No is "+accNo+"  Name is "+name+"  CreationDate is "+
								creationDate);
		System.out.println("     ");
	}
}
