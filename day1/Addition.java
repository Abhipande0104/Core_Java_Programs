package day1;

public class Addition 
{
	private int num1, num2, ans;
	
	public void initValues(int n1, int n2)
	{
		num1=n1;
		num2=n2;
	}
	public void calculateAddition()
	{
		ans=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" is "+ ans);
	}

}
