package dayy15;

public class SimpleOuter 
{
	private int a=10;
	public void display()
	{
		System.out.println("In display before inner class");
	}
	class Inner
	{
		private int b;
		public void test()
		{
			System.out.println("Test in inner class");
			System.out.println(a);
			System.out.println(b);
		}
	}
}

/*
 * SimpleInner Class
 * 
 * - a class being member of another class
 * - being a member of outer class, inner class is associated
 *  with instance of outer class
 * - so an instance of inner class can exist only within an instance
 *  of outer class
 * - to instantiate an inner class, we must first instantiate the outer class
 * 
 * -syntax
 * OuterClass.InnerClass innerObject=outerObject.new InnerClass();
 * 
 */
