package testpackage;

public class Addition
{
	private int n1, n2, n3;
	public Addition(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public void add()
	{
		n3=n1+n2;
		System.out.println("The addition of "+n1+" and "+n2+" is "+n3);
		//System.out.println("The addition is "+ n3);
	}
}
