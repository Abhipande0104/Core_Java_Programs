package dayy15;

public class StaticOuterClass 
{
	private static int num=200;
	//private int a;
	public void display()
	{
		System.out.println("In outer class");
	}
	static class Inner
	{
		private static int num1=100;
		public static void test()
		{
			System.out.println("In inner class "+num1);
			System.out.println("In inner class "+num);
		}
	}
}

/*
 * Static/nested inner class
 * -when inner class is declared static, are called as static inner class
 * -static inner class does not share any special relationship with an instance
 * of outer class
 * -so you do not need a instance of the outer class to instantiate a static
 *  inner class 
 * -a static nested class can not access non-static members of the outer class,
 * since it does not have an implicit reference to any outer instance.
 *
 */
