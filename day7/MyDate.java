package day7;

public class MyDate 
{
	private int day, month, year;
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
	public static void swap(MyDate[] mdarr)
	{
		MyDate temp;
		temp=mdarr[0];
		mdarr[0]=mdarr[1];
		mdarr[1]=temp;
	}
}
