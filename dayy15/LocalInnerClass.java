package dayy15;

import dayy15.SimpleOuter.Inner;

public class LocalInnerClass 
{
	private int a=10;
	public void display()
	{
		final int b=20;
		System.out.println("In display before inner class");
		class Inner
		{
			public void test()
			{
				System.out.println("In display in inner");
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner in = new Inner();
		in.test();
	}
}





















/*
 * Method local inner class
 * 
 * - a class defined within a method of the inner class is called as 
 * "Method local inner class"
 * - in order to access method local inner class instantiation must happen
 * within the same method but after the class definitio code.
 * - a method local inner class can not use variables declared within the method 
 * unless those variables are marked final
 */
