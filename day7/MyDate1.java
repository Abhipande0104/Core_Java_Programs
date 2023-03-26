package day7;

public class MyDate1 
{
	private int day, month, year;
	public MyDate1()
	{
		day=21;
		month=02;
		year=2023;
	}
	public MyDate1(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}