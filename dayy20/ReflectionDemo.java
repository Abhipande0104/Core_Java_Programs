package dayy20;

public class ReflectionDemo
{
	public static void main (String[] args)
	{
		MyClass emp1= new MyClass();
		
		@SuppressWarnings("rawtypes")
		Class ab=emp1.getClass();
		System.out.println(ab.getName());
	}
}
