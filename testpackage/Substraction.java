package testpackage;

public class Substraction
{
	private int n1, n2, n3;
	public Substraction(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public void sub()
	{
		n3=n1-n2;
		System.out.println("The substraction of "+n1+" and "+n2+" is "+n3);
	}
}
