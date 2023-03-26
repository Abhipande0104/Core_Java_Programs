package day1;

public class Division 
{
	private int num1, num2, ans;
	
	public void initValues()
	{
		num1=10;
		num2=20;
	}
	public void calculateDivision()
	{
		ans=num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is "+ ans);
	}
}
