package day4;

public class Customer 
{
	static
	{
		interestrate=7.00f;
	}
	
	private String name;
	private float principleAmount, time, simpleInterest;
	private static float interestrate;
	
	public Customer(String name, float principleAmount, float time)
	{
		this.name=name;
		this.principleAmount=principleAmount;
		this.time=time;
	}
	
	public void calculateSimpleInterest()
	{
		simpleInterest=principleAmount*interestrate*time/100;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("The total interest of "+name+" is "+simpleInterest);
	}
	
}
