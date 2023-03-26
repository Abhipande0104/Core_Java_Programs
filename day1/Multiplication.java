package day1;

public class Multiplication 
{
	private int num1, num2, ans;
	
	public void initValues()
	{
		num1=10;
		num2=20;
	}
	public void calculateMultiplication()
	{
		ans=num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+ ans);
	}
}
