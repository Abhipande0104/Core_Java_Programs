package day3;

public class MyDate 
{
	private int day, month, year;
	public MyDate()
	{
		day=21;
		month=02;
		year=2023;
	}
	public MyDate(int day, int month, int year)
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
