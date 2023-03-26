package testpackage;

public class Multiplication
{
	private int n1, n2, n3;
	public Multiplication(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public void mul()
	{
		n3=n1*n2;
		System.out.println("The multiplication of "+n1+" and "+n2+" is "+n3);
	}
}
