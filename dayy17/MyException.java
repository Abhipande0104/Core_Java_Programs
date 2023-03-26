package dayy17;

public class MyException 
{
	public void myMethod(int num) throws UserDefineException
	{
		if(num<10)
		{
			throw new UserDefineException("Please enter number greater than 10");
		}
	}
	
	public static void main(String[] args)
	{
		MyException ma= new MyException();
		try
		{
			ma.myMethod(1);
		}
		catch(UserDefineException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
