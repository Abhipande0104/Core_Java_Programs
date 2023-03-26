package dayy17;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception
{
	String message;
	
	public InsufficientBalanceException(String msg)
	{
		message=msg;
	}
	
	public String getMessage()
	{
		return message;
	}
}
