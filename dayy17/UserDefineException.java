package dayy17;

@SuppressWarnings("serial")
public class UserDefineException extends Exception
{
	String msg;
	public UserDefineException(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
}
