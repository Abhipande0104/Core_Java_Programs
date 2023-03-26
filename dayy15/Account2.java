package dayy15;

public class Account2 
{
	private int b=20;
	public void display2()
	{
		System.out.println("This is Account2");
		System.out.println(b);
	}
	
	static class Interest
	{
		final static int interestrate=8;
		public static void displayInterest()
		{
			System.out.println("This is interest ");
			System.out.println("The interest rate is "+interestrate);
		}
	}
}
