package day7;

public class MyDateMain 
{
	public static void main(String[] args)
	{
		MyDate md[] = new MyDate[2];
		
		md[0]=new MyDate(23,02,2023);
		md[1]=new MyDate(24,02,2023);
		
		System.out.println("Before swap "+md[0]+"\t"+md[1]);
		
		MyDate.swap(md);
		
		System.out.println("After swap "+md[0]+"\t"+md[1]);
	}
}
