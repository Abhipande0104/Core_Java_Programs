package dayy17;

public class ExceptionThrowDemo1
{
	private int num1=5,num2=0,ans;
	public void display()
	{
		ans=num1+num2;
		if(ans<10)
		{
			throw new ArithmeticException("answer should be greater than 10");
		}
		System.out.println("Addition = "+ans);
	}
	
	public static void main(String[] args)
	{
		ExceptionThrowDemo1 td = new ExceptionThrowDemo1();
		try
		{
			td.display();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
	}
}