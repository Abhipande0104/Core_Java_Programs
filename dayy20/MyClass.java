package dayy20;

@MyAnno(value=1, name="This is my class")
public class MyClass
{
	//private int a;
	
	@MyAnno(value=2, name="This method is used to show data")
	public void show()
	{
		System.out.println("This is annotation class");
	}
	
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.show();
	}
}
