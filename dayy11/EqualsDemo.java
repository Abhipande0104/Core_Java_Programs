package dayy11;

public class EqualsDemo 
{
	public static void main(String[] abcd)
	{
		Addition a1= new Addition();
		Addition a2= new Addition();
		
		String s1="abhishek";
		String s2="Abhishek";
		
		System.out.println(s1.equals(s2));
		System.out.println(a1.equals(a2));
		
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
