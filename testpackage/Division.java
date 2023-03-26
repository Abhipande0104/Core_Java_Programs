package testpackage;

public class Division
{
	private int n1, n2, n3;
	public Division(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public void div()
	{
		n3=n1/n2;
		System.out.println("The division of "+n1+" and "+n2+" is "+n3);
	}
}
