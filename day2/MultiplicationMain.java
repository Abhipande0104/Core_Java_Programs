package day2;

public class MultiplicationMain 
{
	public static void main(String[] args)
	{
		Multiplication obj = new Multiplication();
		
		obj.multiply(10, 20, 30);
		//obj.multiply
		obj.multiply(12.5f,10);
		obj.multiply(10,20);
		
		//int var1=obj.multiply(12.5f,13.5f);
		int var2=obj.multiply(10,20);
		
		//System.out.println(var1);
		System.out.println(var2);
		
	}
}
