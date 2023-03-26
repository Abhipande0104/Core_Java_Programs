package day1;

public class CircleArea 
{
	private int radius;
	private double pi;
	private double area;
	
	public void initValue(int r, double p)
	{
		radius=r;
		pi=p;	
	}
	public void calculateArea()
	{
		area=pi*radius*radius;
	}
	public void displayArea()
	{
		System.out.println("The area of circle is "+area);
	}
}
