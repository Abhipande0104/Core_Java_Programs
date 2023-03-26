package dayy10;

public class Account 
{
	protected int accNo;
	protected String name;
	
	public Account(int accNo, String name) 
	{
		this.accNo=accNo;
		this.name=name;
	}
	
	/*public String toString()
	{
		return "The account no is "+accNo+" and name is "+name;
	}*/
	
	public void print()
	{
		System.out.println("The account no is "+accNo+" and name is "+name);
	}
}
