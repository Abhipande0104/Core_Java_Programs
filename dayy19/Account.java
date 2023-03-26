package dayy19;

public class Account 
{
	private int accno;
	private String name;
	
	public Account(int accno, String name)
	{
		this.accno=accno;
		this.name=name;
	}
	/*public void display()
	{
		System.out.println("Acc no is "+accno+" Name is "+name);
	}*/
	public String toString()
	{
		return ("Account no is "+accno+" and name is "+name);
	}

}
