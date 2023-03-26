package dayy13;

import java.util.Scanner;

public class TestPack 
{
	public static void main(String [] nmj)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name;
		int num;
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("Name is "+name+" number is "+num);
	}
}
