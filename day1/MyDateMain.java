package day1;

public class MyDateMain 
{

	public static void main(String[] args) 
	{
		MyDate md=new MyDate();
		int d=01;
		int m=04;
		int y=2002;
		md.setDay(d);
		md.setMonth(m);
		md.setYear(y);
		int var1=md.getDay();
		int var2=md.getMonth();
		int var3=md.getYear();
		System.out.println("The date is ");
		System.out.println(var1+"/"+var2+"/"+var3);
		//System.out.println(var2);
		//System.out.println(var3);
		
		
		
		
		
		
		
		
		
		/*int d, m, y;
		MyDate d1= new MyDate();
		d=01;
		m=02;
		y=2023;
		
		d1.initValues(d, m, y);
		d1.displayDate();*/

	}

}
