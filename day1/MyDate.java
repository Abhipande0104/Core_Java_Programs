package day1;

public class MyDate 
{
	private int day, month, year;
	
	public void setDay(int d)
	{
		day=d;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public void setYear(int y)
	{
		year=y;
	}
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	/*public void initValues(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;		
	}*/
	public void displayDate()
	{
		System.out.println("The date is "+day+"/"+month+"/"+year);
	}
}
