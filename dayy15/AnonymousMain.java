package dayy15;

public class AnonymousMain 
{
	public static void main(String[] args)
	{
		Anonymous obj = new Anonymous();
		obj.drive();
		
		Anonymous obj1 =new Anonymous() 
		{
			public void drive() 
			{
				System.out.println("anonymous class Ferrari");
			};
		};
		obj1.drive();
	}
}

/*
 * Anonymous Inner Class
 * - inner classes that are declared without a name are called anonymous inner
 * class
 * - facilitates writing of event handlers
 * - anonymous inner class have no name and their type must be either a subclass 
 * of the named type or an implement of the named interface.
 */
