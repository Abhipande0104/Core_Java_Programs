package day2;

public class Account 
{
	int accNo;
	String ownerName;
	double balance;
	
	public void setAccNo(int a)
	{
		accNo=a;
	}
	public void setOwnerName(String o)
	{
		ownerName=o;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public double getBalance()
	{
		return balance;
	}
}
